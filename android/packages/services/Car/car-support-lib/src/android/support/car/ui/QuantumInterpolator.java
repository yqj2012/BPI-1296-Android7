/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.support.car.ui;

import android.animation.TimeInterpolator;

/**
 * Interpolator that can animate any of the quantum curves.
 * You can also specify
 */
public class QuantumInterpolator implements TimeInterpolator {

    /**
     * Lookup table values.
     * Generated using a Bezier curve from (0,0) to (1,1) with control points:
     * P0 (0,0)
     * P1 (0.4, 0)
     * P2 (0.2, 1.0)
     * P3 (1.0, 1.0)
     *
     * Values sampled with x at regular intervals between 0 and 1.
     *
     * These values were generated using:
     *   ./scripts/bezier_interpolator_values_gen.py 0.4 0.2
     */
    public static final float[] FAST_OUT_SLOW_IN = new float[] {
            0.0f, 0.0002f, 0.0009f, 0.0019f, 0.0036f, 0.0059f, 0.0086f, 0.0119f, 0.0157f, 0.0209f,
            0.0257f, 0.0321f, 0.0392f, 0.0469f, 0.0566f, 0.0656f, 0.0768f, 0.0887f, 0.1033f, 0.1186f,
            0.1349f, 0.1519f, 0.1696f, 0.1928f, 0.2121f, 0.237f, 0.2627f, 0.2892f, 0.3109f, 0.3386f,
            0.3667f, 0.3952f, 0.4241f, 0.4474f, 0.4766f, 0.5f, 0.5234f, 0.5468f, 0.5701f, 0.5933f,
            0.6134f, 0.6333f, 0.6531f, 0.6698f, 0.6891f, 0.7054f, 0.7214f, 0.7346f, 0.7502f, 0.763f,
            0.7756f, 0.7879f, 0.8f, 0.8107f, 0.8212f, 0.8326f, 0.8415f, 0.8503f, 0.8588f, 0.8672f,
            0.8754f, 0.8833f, 0.8911f, 0.8977f, 0.9041f, 0.9113f, 0.9165f, 0.9232f, 0.9281f, 0.9328f,
            0.9382f, 0.9434f, 0.9476f, 0.9518f, 0.9557f, 0.9596f, 0.9632f, 0.9662f, 0.9695f, 0.9722f,
            0.9753f, 0.9777f, 0.9805f, 0.9826f, 0.9847f, 0.9866f, 0.9884f, 0.9901f, 0.9917f, 0.9931f,
            0.9944f, 0.9955f, 0.9964f, 0.9973f, 0.9981f, 0.9986f, 0.9992f, 0.9995f, 0.9998f, 1.0f, 1.0f
    };

    /**
     * These values were generated using:
     *   ./scripts/bezier_interpolator_values_gen.py 0.0 0.2
     */
    public static final float[] LINEAR_OUT_SLOW_IN = new float[] {
            0.0029f, 0.043f, 0.0785f, 0.1147f, 0.1476f, 0.1742f, 0.2024f, 0.2319f, 0.2575f, 0.2786f,
            0.3055f, 0.3274f, 0.3498f, 0.3695f, 0.3895f, 0.4096f, 0.4299f, 0.4474f, 0.4649f,
            0.4824f, 0.5f, 0.5176f, 0.5322f, 0.5468f, 0.5643f, 0.5788f, 0.5918f, 0.6048f, 0.6191f,
            0.6333f, 0.6446f, 0.6573f, 0.6698f, 0.6808f, 0.6918f, 0.704f, 0.7148f, 0.7254f, 0.7346f,
            0.7451f, 0.7554f, 0.7655f, 0.7731f, 0.783f, 0.7916f, 0.8f, 0.8084f, 0.8166f, 0.8235f,
            0.8315f, 0.8393f, 0.8459f, 0.8535f, 0.8599f, 0.8672f, 0.8733f, 0.8794f, 0.8853f,
            0.8911f, 0.8967f, 0.9023f, 0.9077f, 0.9121f, 0.9173f, 0.9224f, 0.9265f, 0.9313f,
            0.9352f, 0.9397f, 0.9434f, 0.9476f, 0.9511f, 0.9544f, 0.9577f, 0.9614f, 0.9644f,
            0.9673f, 0.9701f, 0.9727f, 0.9753f, 0.9777f, 0.98f, 0.9818f, 0.9839f, 0.9859f, 0.9877f,
            0.9891f, 0.9907f, 0.9922f, 0.9933f, 0.9946f, 0.9957f, 0.9966f, 0.9974f, 0.9981f,
            0.9986f, 0.9992f, 0.9995f, 0.9998f, 1.0f, 1.0f
    };

    /**
     * These values were generated using:
     *   ./scripts/bezier_interpolator_values_gen.py 0.0 0.2
     */
    public static final float[] FAST_OUT_LINEAR_IN = new float[] {
            0.0f, 0.0002f, 0.0008f, 0.0019f, 0.0032f, 0.0049f, 0.0069f, 0.0093f, 0.0119f, 0.0149f,
            0.0182f, 0.0218f, 0.0257f, 0.0299f, 0.0344f, 0.0392f, 0.0443f, 0.0496f, 0.0552f,
            0.0603f, 0.0656f, 0.0719f, 0.0785f, 0.0853f, 0.0923f, 0.0986f, 0.1051f, 0.1128f,
            0.1206f, 0.1287f, 0.1359f, 0.1433f, 0.1519f, 0.1607f, 0.1696f, 0.1776f, 0.1857f,
            0.1952f, 0.2048f, 0.2145f, 0.2232f, 0.2319f, 0.2421f, 0.2523f, 0.2627f, 0.2733f,
            0.2826f, 0.2919f, 0.3027f, 0.3137f, 0.3247f, 0.3358f, 0.3469f, 0.3582f, 0.3695f,
            0.3809f, 0.3924f, 0.4039f, 0.4154f, 0.427f, 0.4386f, 0.4503f, 0.4619f, 0.4751f, 0.4883f,
            0.5f, 0.5117f, 0.5264f, 0.5381f, 0.5497f, 0.5643f, 0.5759f, 0.5904f, 0.6033f, 0.6162f,
            0.6305f, 0.6446f, 0.6587f, 0.6698f, 0.6836f, 0.7f, 0.7134f, 0.7267f, 0.7425f, 0.7554f,
            0.7706f, 0.7855f, 0.8f, 0.8143f, 0.8281f, 0.8438f, 0.8588f, 0.8733f, 0.8892f, 0.9041f,
            0.9215f, 0.9344f, 0.9518f, 0.9667f, 0.9826f, 0.9993f

    };

    private final float[] mValues;
    private final float mStepSize;
    private final float mStartTime;
    private final float mEndTime;

    public QuantumInterpolator(float[] values, float pre, float during, float post) {
        super();
        mValues = values;
        mStepSize = 1.0f / (mValues.length - 1);
        mStartTime = pre / (pre + during + post);
        mEndTime = mStartTime + (during / (pre + during + post));
    }

    @Override
    public float getInterpolation(float input) {
        return getInterpolation(input, mStartTime, mEndTime);
    }

    public float getReverseInterpolation(float input) {
        return getInterpolation(input, 1 - mEndTime, 1 - mStartTime);
    }

    public float getInterpolation(float input, float startTime, float endTime) {
        if (input <= startTime) {
            return 0.0f;
        } else if (input >= endTime) {
            return 1.0f;
        }

        input = (input - startTime) / (endTime - startTime);

        int position = Math.min(
                (int)(input * (mValues.length - 1)),
                mValues.length - 2);

        float quantized = position * mStepSize;
        float difference = input - quantized;
        float weight = difference / mStepSize;

        return mValues[position] + weight * (mValues[position + 1] - mValues[position]);
    }
}
