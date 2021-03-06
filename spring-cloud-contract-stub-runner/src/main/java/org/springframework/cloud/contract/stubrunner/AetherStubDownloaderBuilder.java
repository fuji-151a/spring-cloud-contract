/*
 * Copyright 2013-2019 the original author or authors.
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

package org.springframework.cloud.contract.stubrunner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;

/**
 * @author Marcin Grzejszczak
 * @since 2.0.0
 */
public class AetherStubDownloaderBuilder implements StubDownloaderBuilder {

	private static final Log log = LogFactory.getLog(AetherStubDownloaderBuilder.class);

	@Override
	public StubDownloader build(StubRunnerOptions stubRunnerOptions) {
		if (stubRunnerOptions.stubsMode == StubRunnerProperties.StubsMode.CLASSPATH) {
			return null;
		}
		log.info("Will download stubs and contracts via Aether");
		return new AetherStubDownloader(stubRunnerOptions);
	}

}
