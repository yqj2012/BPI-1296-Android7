INCLUDE(../../../include/config.txt)
SET(LIBNAME fileaccess)
SET(LIBRARY_OUTPUT_PATH ../../../lib/)

SET(MYDEFS )
SET(rm " /bin/rm -f")
SET(CC " ${MYCC}")
SET(AR " ${MYAR} cq")
SET(RANLIB " ${MYRANLIB}")
#SET(LIBNAME ../../../lib/libfileaccess.a)

SET(INCLUDES ${INCLUDES} ${CMAKE_CURRENT_SOURCE_DIR}/.)
SET(INCLUDES ${INCLUDES} ${CMAKE_CURRENT_SOURCE_DIR}/../../Include)
SET(INCLUDES  ${INCLUDES} ${CMAKE_CURRENT_SOURCE_DIR}/../../Include/io)

SET(CFLAGS " ${DEFINES} -DSYS_UNIX=1 ${MYDEFS}")
SET(SRCS file_db.c file_util.c gfile_common.c array_funcs.c list_funcs.c
simple_funcs.c fastcopy_wrapper.cpp)
SET(OBJS file_db.o file_util.o gfile_common.o array_funcs.o list_funcs.o simple_funcs.o fastcopy_wrapper.o)
INCLUDE_DIRECTORIES(${INCLUDES})
ADD_DEFINITIONS(${CFLAGS} ${DEBUGFLAG} ${WARNING})
ADD_LIBRARY(${LIBNAME} ${SRCS})
string(REGEX REPLACE  ";" " " APCFG_DVR  ${APCFG_DVR})
string(REGEX REPLACE  ";" " " CHIP_MODEL_DEFS ${CHIP_MODEL_DEFS})
string(REGEX REPLACE  ";" " " APCFG_DEFS ${APCFG_DEFS})
#string(REGEX REPLACE  ";" " " BUILD_OPTIONS ${BUILD_OPTIONS})
string(REGEX REPLACE  ";" " " DEFINES ${DEFINES})
string(REGEX REPLACE  ";" " " APCFG_FLAGS ${APCFG_FLAGS})
