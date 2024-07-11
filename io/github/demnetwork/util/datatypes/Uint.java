/*
 *   Copyright (c) 2024 DEMnetwork
 *   All rights reserved.

 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 
 *   The above copyright notice and this permission notice shall be included in all
 *   copies or substantial portions of the Software.
 
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *   SOFTWARE.
 */
package io.github.demnetwork.util.datatypes;

import io.github.demnetwork.Logger.Logger;
import io.github.demnetwork.util.exception.*;
import io.github.demnetwork.util.exception.IllegalArgumentException;

/**
 * @apiNote This class implements a Unsinged Intreger(Uint)
 * 
 * @author DEMNetwork(Arthur Y. Arakaki)
 */

@SuppressWarnings("deprecation")
public class Uint {
    private long UintData;
    private boolean isFinal = false;
    private long UintData2;
    private long LSdataParse;
    private int IntLSDataParse;
    private long UintDataOld;
    private int[] UintArrayData = { 0, 0 };
    private long UintData1;
    private int interations;
    private long BinaryDataConvTemp;
    private long BinaryDataConvTemp2;
    private boolean[] UintBinaryData = { false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false };

    /**
     * @throws io.github.demnetwork.util.exception.IllegalArgumentException
     * 
     * @apiNote Creates a Uint
     */
    public Uint(int MSdata, int LSdata) {
        if (MSdata > 1) {
            throw new IllegalArgumentException(
                    "The most significant intreger of the 'Uint' CANNOT be greater than 1");
        }
        if (MSdata < 0) {
            throw new IllegalArgumentException("The most significant intreger cannot be less than 0");
        }
        UintData = LSdata;
        UintArrayData[1] = LSdata;
        LSdataParse = LSdata;
        if (MSdata == 1) {
            UintData = UintData + 2147483648L;
            UintDataOld = UintData;
            UintArrayData[0] = 1;
        }
    }

    /**
     * @throws io.github.demnetwork.util.exception.IllegalArgumentException
     * 
     * @apiNote Creates a Uint
     */
    public Uint(int MSdata, int LSdata, boolean isUintFinal) {
        if (MSdata > 1) {
            throw new IllegalArgumentException(
                    "The most significant intreger of the 'Uint' CANNOT be greater than 1");
        }
        if (MSdata < 0) {
            throw new IllegalArgumentException("The most significant intreger cannot be less than 0");
        }
        UintData = LSdata;
        UintArrayData[1] = LSdata;
        LSdataParse = LSdata;
        if (MSdata == 1) {
            UintData = UintData + 2147483648L;
            UintDataOld = UintData;
            UintArrayData[0] = 1;
        }
        isFinal = isUintFinal;
    }

    /**
     * @return Returns the data in the Uint as a long
     */
    public long getDataAsLong() {
        return UintData;
    }

    /**
     * @return Returns the data in the Uint as a String
     */
    public String getDataAsString() {
        return "" + UintData;
    }

    /**
     * @param index
     * @return Returns the data in the Uint as a an int
     */
    public int getDataAsInt(int index) {
        return UintArrayData[index];
    }

    /**
     * @return Returns the data in the Uint as an array of intregers
     */
    public int[] getDataAsIntArray() {
        return UintArrayData;
    }

    public boolean[] getDataAsBooleanArray() {
        UintData1 = UintData;
        if (UintData1 >= Math.pow(2, 31)) {
            interations = 32;
        } else {
            if (UintData1 >= Math.pow(2, 30)) {
                interations = 31;
            } else {
                if (UintData1 >= Math.pow(2, 29)) {
                    interations = 30;
                } else {
                    if (UintData1 >= Math.pow(2, 28)) {
                        interations = 29;
                    } else {
                        if (UintData1 >= Math.pow(2, 27)) {
                            interations = 28;
                        } else {
                            if (UintData1 >= Math.pow(2, 26)) {
                                interations = 27;
                            } else {
                                if (UintData1 >= Math.pow(2, 25)) {
                                    interations = 26;
                                } else {
                                    if (UintData1 >= Math.pow(2, 24)) {
                                        interations = 25;
                                    } else {
                                        if (UintData1 >= Math.pow(2, 23)) {
                                            interations = 24;
                                        } else {
                                            if (UintData1 >= Math.pow(2, 22)) {
                                                interations = 23;
                                            } else {
                                                if (UintData1 >= Math.pow(2, 21)) {
                                                    interations = 22;
                                                } else {
                                                    if (UintData1 >= Math.pow(2, 20)) {
                                                        interations = 21;
                                                    } else {
                                                        if (UintData1 >= Math.pow(2, 19)) {
                                                            interations = 20;
                                                        } else {
                                                            if (UintData1 >= Math.pow(2, 18)) {
                                                                interations = 19;
                                                            } else {
                                                                if (UintData1 >= Math.pow(2, 17)) {
                                                                    interations = 18;
                                                                } else {
                                                                    if (UintData1 >= Math.pow(2, 16)) {
                                                                        interations = 17;
                                                                    } else {
                                                                        if (UintData1 >= Math.pow(2, 15)) {
                                                                            interations = 16;
                                                                        } else {
                                                                            if (UintData1 >= Math.pow(2, 14)) {
                                                                                interations = 15;
                                                                            } else {
                                                                                if (UintData1 >= Math.pow(2, 13)) {
                                                                                    interations = 14;
                                                                                } else {
                                                                                    if (UintData1 >= Math.pow(2, 12)) {
                                                                                        interations = 13;
                                                                                    } else {
                                                                                        if (UintData1 >= Math.pow(2,
                                                                                                11)) {
                                                                                            interations = 12;
                                                                                        } else {
                                                                                            if (UintData1 >= Math.pow(2,
                                                                                                    10)) {
                                                                                                interations = 11;
                                                                                            } else {
                                                                                                if (UintData1 >= Math
                                                                                                        .pow(2, 9)) {
                                                                                                    interations = 10;
                                                                                                } else {
                                                                                                    if (UintData1 >= Math
                                                                                                            .pow(2, 8)) {
                                                                                                        interations = 9;
                                                                                                    } else {
                                                                                                        if (UintData1 >= Math
                                                                                                                .pow(2, 7)) {
                                                                                                            interations = 8;
                                                                                                        } else {
                                                                                                            if (UintData1 >= Math
                                                                                                                    .pow(2, 6)) {
                                                                                                                interations = 7;
                                                                                                            } else {
                                                                                                                if (UintData1 >= Math
                                                                                                                        .pow(2, 5)) {
                                                                                                                    interations = 6;
                                                                                                                } else {
                                                                                                                    if (UintData1 >= Math
                                                                                                                            .pow(2, 4)) {
                                                                                                                        interations = 5;
                                                                                                                    } else {
                                                                                                                        if (UintData1 >= Math
                                                                                                                                .pow(2, 3)) {
                                                                                                                            interations = 4;
                                                                                                                        } else {
                                                                                                                            if (UintData1 >= Math
                                                                                                                                    .pow(2, 2)) {
                                                                                                                                interations = 3;
                                                                                                                            } else {
                                                                                                                                if (UintData1 >= Math
                                                                                                                                        .pow(2, 1)) {
                                                                                                                                    interations = 2;
                                                                                                                                } else {
                                                                                                                                    if (UintData1 >= Math
                                                                                                                                            .pow(2, 0)) {
                                                                                                                                        interations = 1;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        BinaryDataConvTemp = UintData1 / 2;
        BinaryDataConvTemp2 = UintData % 2;
        for (int i = 0; (i + 1) < interations; i++) {
            if (BinaryDataConvTemp2 == 1) {
                UintBinaryData[(UintBinaryData.length - i) - i] = true;
            }
            if (BinaryDataConvTemp2 == 0) {
                UintBinaryData[(UintBinaryData.length - 1) - i] = false;
            }
            BinaryDataConvTemp2 = BinaryDataConvTemp % 2;
            BinaryDataConvTemp = BinaryDataConvTemp / 2;
        }
        return UintBinaryData;
    }

    public boolean getDataAsBoolean(int index) {
        UintData1 = UintData;
        if (UintData1 >= Math.pow(2, 31)) {
            interations = 32;
        } else {
            if (UintData1 >= Math.pow(2, 30)) {
                interations = 31;
            } else {
                if (UintData1 >= Math.pow(2, 29)) {
                    interations = 30;
                } else {
                    if (UintData1 >= Math.pow(2, 28)) {
                        interations = 29;
                    } else {
                        if (UintData1 >= Math.pow(2, 27)) {
                            interations = 28;
                        } else {
                            if (UintData1 >= Math.pow(2, 26)) {
                                interations = 27;
                            } else {
                                if (UintData1 >= Math.pow(2, 25)) {
                                    interations = 26;
                                } else {
                                    if (UintData1 >= Math.pow(2, 24)) {
                                        interations = 25;
                                    } else {
                                        if (UintData1 >= Math.pow(2, 23)) {
                                            interations = 24;
                                        } else {
                                            if (UintData1 >= Math.pow(2, 22)) {
                                                interations = 23;
                                            } else {
                                                if (UintData1 >= Math.pow(2, 21)) {
                                                    interations = 22;
                                                } else {
                                                    if (UintData1 >= Math.pow(2, 20)) {
                                                        interations = 21;
                                                    } else {
                                                        if (UintData1 >= Math.pow(2, 19)) {
                                                            interations = 20;
                                                        } else {
                                                            if (UintData1 >= Math.pow(2, 18)) {
                                                                interations = 19;
                                                            } else {
                                                                if (UintData1 >= Math.pow(2, 17)) {
                                                                    interations = 18;
                                                                } else {
                                                                    if (UintData1 >= Math.pow(2, 16)) {
                                                                        interations = 17;
                                                                    } else {
                                                                        if (UintData1 >= Math.pow(2, 15)) {
                                                                            interations = 16;
                                                                        } else {
                                                                            if (UintData1 >= Math.pow(2, 14)) {
                                                                                interations = 15;
                                                                            } else {
                                                                                if (UintData1 >= Math.pow(2, 13)) {
                                                                                    interations = 14;
                                                                                } else {
                                                                                    if (UintData1 >= Math.pow(2, 12)) {
                                                                                        interations = 13;
                                                                                    } else {
                                                                                        if (UintData1 >= Math.pow(2,
                                                                                                11)) {
                                                                                            interations = 12;
                                                                                        } else {
                                                                                            if (UintData1 >= Math.pow(2,
                                                                                                    10)) {
                                                                                                interations = 11;
                                                                                            } else {
                                                                                                if (UintData1 >= Math
                                                                                                        .pow(2, 9)) {
                                                                                                    interations = 10;
                                                                                                } else {
                                                                                                    if (UintData1 >= Math
                                                                                                            .pow(2, 8)) {
                                                                                                        interations = 9;
                                                                                                    } else {
                                                                                                        if (UintData1 >= Math
                                                                                                                .pow(2, 7)) {
                                                                                                            interations = 8;
                                                                                                        } else {
                                                                                                            if (UintData1 >= Math
                                                                                                                    .pow(2, 6)) {
                                                                                                                interations = 7;
                                                                                                            } else {
                                                                                                                if (UintData1 >= Math
                                                                                                                        .pow(2, 5)) {
                                                                                                                    interations = 6;
                                                                                                                } else {
                                                                                                                    if (UintData1 >= Math
                                                                                                                            .pow(2, 4)) {
                                                                                                                        interations = 5;
                                                                                                                    } else {
                                                                                                                        if (UintData1 >= Math
                                                                                                                                .pow(2, 3)) {
                                                                                                                            interations = 4;
                                                                                                                        } else {
                                                                                                                            if (UintData1 >= Math
                                                                                                                                    .pow(2, 2)) {
                                                                                                                                interations = 3;
                                                                                                                            } else {
                                                                                                                                if (UintData1 >= Math
                                                                                                                                        .pow(2, 1)) {
                                                                                                                                    interations = 2;
                                                                                                                                } else {
                                                                                                                                    if (UintData1 >= Math
                                                                                                                                            .pow(2, 0)) {
                                                                                                                                        interations = 1;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        BinaryDataConvTemp = UintData1 / 2;
        BinaryDataConvTemp2 = UintData % 2;
        for (int i = 0; (i + 1) < interations; i++) {
            if (BinaryDataConvTemp2 == 1) {
                UintBinaryData[(UintBinaryData.length - 1) - i] = true;
            }
            if (BinaryDataConvTemp2 == 0) {
                UintBinaryData[(UintBinaryData.length - 1) - i] = false;
            }
            BinaryDataConvTemp2 = BinaryDataConvTemp % 2;
            BinaryDataConvTemp = BinaryDataConvTemp / 2;
        }
        return UintBinaryData[index];
    }

    /**
     * 
     * @param amount
     * @throws IllegalValueException If the value is greater than 4294967296
     * 
     */
    public void set(long amount) throws IllegalValueException {
        if (amount >= 4294967296L) {
            throw new IllegalValueException(amount);
        }
        if (amount < 0) {
            throw new IllegalValueException(amount);
        }
        UintData = amount;
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * 
     * @param amount
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296
     * @throws IllegalArgumentException If the Uint is final
     */
    public void add(int amount) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        UintData = UintData + amount;
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * 
     * @param amount
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296
     * @throws IllegalArgumentException If the Uint is final
     */
    public void remove(int amount) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        UintData = UintData - amount;
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * 
     * @param amount
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296
     * @throws IllegalArgumentException If the Uint is final
     */
    public void multiply(int amount) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        UintData = UintData * amount;
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * 
     * @param amount
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296
     * @throws IllegalArgumentException If the Uint is final
     */
    public void divide(int amount) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        UintData = UintData / amount;
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * @apiNote This method does exponentiation using the current number as the base
     * 
     * @param expoent
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296, if the expoent and the base are
     *                                  both zero or
     *                                  when the expoent is less than zero
     * @throws IllegalArgumentException If the Uint is final
     * @see {@link #setToPower(int, int)}
     */
    public void power(int expoent) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        if (expoent < 0) {
            throw new IllegalArgumentException("The expoent CANNOT be less than zero");
        }
        if (UintData == 0 && expoent == 0) {
            throw new IllegalArgumentException("The expoent and the Uint data CANNOT be both zero");
        }
        if (expoent == 0) {
            try {
                set(1L);
            } catch (IllegalValueException err) {
                new Logger(true, err.getMessage(), err.getStackTrace());
            }
        }
        if (UintData == 1L) {
            try {
                set(1L);
            } catch (IllegalValueException err) {
                new Logger(true, err.getMessage(), err.getStackTrace());
            }
        }
        UintData = (long) Math.pow(UintData, expoent);
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * @apiNote This method sets the UintData with the result of the exponentiation
     *          between the base and the expoent
     * 
     * @throws IllegalValueException    If the result value is greater than or equal
     *                                  4294967296,
     *                                  if the expoent and the base are both zero or
     *                                  when the expoent is less than zero
     * @throws IllegalArgumentException If the Uint is final
     * @see {@link #power(int)}
     */
    public void setToPower(int base, int expoent) throws IllegalValueException {
        if (isFinal == true) {
            throw new IllegalArgumentException("You cannot change the value of a Final Variable");
        }
        if (expoent < 0) {
            throw new IllegalArgumentException("The expoent CANNOT be less than zero");
        }
        if (base == 0 && expoent == 0) {
            throw new IllegalArgumentException("The expoent and the base CANNOT be both zero");
        }
        if (expoent == 0) {
            try {
                set(1L);
            } catch (IllegalValueException err) {
                new Logger(true, err.getMessage(), err.getStackTrace());
            }
        }
        if (base == 1L) {
            try {
                set(1L);
            } catch (IllegalValueException err) {
                new Logger(true, err.getMessage(), err.getStackTrace());
            }
        }
        UintData = (long) Math.pow(base, expoent);
        if (UintData >= 4294967296L) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData < 0) {
            UintData2 = UintData;
            UintData = UintDataOld;
            throw new IllegalValueException(UintData2);
        }
        if (UintData >= 2147483648L) {
            UintArrayData[0] = 1;
        } else {
            UintArrayData[0] = 0;
        }
        LSdataParse = (UintData - 2147483648L);
        IntLSDataParse = (int) LSdataParse;
        UintArrayData[1] = IntLSDataParse;
        UintDataOld = UintData;
    }

    /**
     * @apiNote Makes the Uint Final meaning you cannot change its value
     * @param b
     */
    public void setFinal(boolean b) {
        isFinal = b;
    }
}
