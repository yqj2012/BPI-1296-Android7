#ifndef _TAR_H_
#define _TAR_H_

#include <sys/types.h>

typedef struct posix_header_t
{					/* byte offset */
	char name[100]; /* 0 */
	char mode[8]; /* 100 */
	char uid[8]; /* 108 */
	char gid[8]; /* 116 */
	char size[12]; /* 124 */
	char mtime[12]; /* 136 */
	char chksum[8]; /* 148 */
	char typeflag; /* 156 */
	char linkname[100]; /* 157 */
	char magic[6]; /* 257 */
	char version[2]; /* 263 */
	char uname[32]; /* 265 */
	char gname[32]; /* 297 */
	char devmajor[8]; /* 329 */
	char devminor[8]; /* 337 */
	char prefix[155]; /* 345 */
						/* 500 */
	unsigned int rtk_seqnum; /*500 */
	unsigned int rtk_tarsize; /*504 */
	char rtk_signature[4]; /*508 */
} __attribute__((packed)) posix_header;

int tar_dump_posix_header(posix_header *header);
int tar_check_header(char *cheader);
void tar_fill_checksum(char *cheader);
void tar_build_header(char *cheader, const char* filename, int length, char filetype);
int tar_read_by_index(int index, char *src_addr, char *dst_addr, int* length, char *name);
addr_t tar_read(const char *s, char *src_addr, unsigned int length, char **dst_addr, unsigned int *dst_length);
int tar_add_or_delete(char *dst_tar_buf, const char* filename, char *src_buf, int length, char *tmp_buf, int tmp_buf_length, int addordel);

#endif	/* _TAR_H_ */

