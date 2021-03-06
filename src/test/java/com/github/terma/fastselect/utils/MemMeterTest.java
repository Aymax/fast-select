/*
Copyright 2015-2016 Artem Stasiuk

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.github.terma.fastselect.utils;

import junit.framework.Assert;
import org.junit.Test;

public class MemMeterTest {

    @Test
    public void provideUsedMem() {
        MemMeter memMeter = new MemMeter();
        Assert.assertTrue(memMeter.getUsed() > -1);
    }

    @Test
    public void provideDeltaOfUsedMem() {
        MemMeter memMeter = new MemMeter();
        long[] data = new long[9000000];
        Assert.assertTrue(memMeter.getUsed() > 0);
        Assert.assertTrue(data.length > 0);
    }

    @Test
    public void provideUsedMemInMb() {
        MemMeter memMeter = new MemMeter();
        Assert.assertTrue(memMeter.getUsedMb() > -1);
    }

}
