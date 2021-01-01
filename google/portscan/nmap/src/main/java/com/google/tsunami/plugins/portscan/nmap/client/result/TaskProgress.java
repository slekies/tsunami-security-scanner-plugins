/*
 * Copyright 2020 Google LLC
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
package com.google.tsunami.plugins.portscan.nmap.client.result;

import com.google.auto.value.AutoValue;

/** TaskProgress element of nmap XML result. */
@AutoValue
public abstract class TaskProgress {
  public abstract String task();
  public abstract String time();
  public abstract String percent();
  public abstract String remaining();
  public abstract String etc();

  public abstract Builder toBuilder();
  public static Builder builder() {
    return new AutoValue_TaskProgress.Builder();
  }

  /** Builder for {@link TaskProgress}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setTask(String value);
    public abstract Builder setTime(String value);
    public abstract Builder setPercent(String value);
    public abstract Builder setRemaining(String value);
    public abstract Builder setEtc(String value);

    public abstract TaskProgress build();
  }
}
