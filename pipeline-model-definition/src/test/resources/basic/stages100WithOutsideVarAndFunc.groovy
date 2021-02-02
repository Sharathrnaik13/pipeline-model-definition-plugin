/*
 * The MIT License
 *
 * Copyright (c) 2017, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

def someVar = "Hi there"
def (firstVar, secondVar) = [1, 2]
def someFunc() {
    return "This comes from a function"
}

pipeline {
    agent none
    stages {
        stage("letters1 = 'a', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'a', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'b', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'c', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'd', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'e', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'f', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'g', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'h', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'i', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'a', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'b', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'c', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'd', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'e', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'f', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'g', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'h', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'i', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
        stage("letters1 = 'j', letters10 = 'j', letters100 = 'a'") { steps { echo "${someVar} - ${someFunc()}" } }
    }
}
