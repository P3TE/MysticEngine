/*
 * Copyright (c) 2002-2010 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

public interface EXT_texture_sRGB_decode {

	/**
	 * Accepted by the &lt;pname&gt; parameter of TexParameterf, TexParameteri,
	 * GetTexParameterfv, GetTexParameteriv, SamplerParameteri,
	 * SamplerParameterf, SamplerParameteriv, SamplerParameterfv,
	 * SamplerParameterIiv, SamplerParameterIuiv, GetSamplerParameteriv,
	 * GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv:
	 */
	int GL_TEXTURE_SRGB_DECODE_EXT = 0x8A48;

	/**
	 * Accepted by the &lt;enum&gt; parameter of TexParameterf, TexParameteri,
	 * SamplerParameteri, SamplerParameterf, SamplerParameteriv, SamplerParameterfv,
	 * SamplerParameterIiv and SamplerParameterIuiv:
	 */
	int GL_DECODE_EXT = 0x8A49,
		GL_SKIP_DECODE_EXT = 0x8A4A;

}