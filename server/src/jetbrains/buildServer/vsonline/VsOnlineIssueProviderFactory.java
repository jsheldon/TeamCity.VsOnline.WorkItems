/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetbrains.buildServer.vsonline;

import jetbrains.buildServer.issueTracker.IssueFetcher;
import jetbrains.buildServer.issueTracker.IssueProvider;
import jetbrains.buildServer.issueTracker.IssueProviderFactory;
import org.jetbrains.annotations.NotNull;

/**
 * @author Oleg Rybak <oleg.rybak@jetbrains.com>
 */
public class VsOnlineIssueProviderFactory implements IssueProviderFactory {

  @NotNull
  private final IssueFetcher myFetcher;

  public VsOnlineIssueProviderFactory(@NotNull final IssueFetcher fetcher) {
    myFetcher = fetcher;
  }

  @NotNull
  public String getType() {
    return VsOnlineIssueProvider.PROVIDER_TYPE;
  }

  @NotNull
  public IssueProvider createProvider() {
    return new VsOnlineIssueProvider(myFetcher);
  }
}