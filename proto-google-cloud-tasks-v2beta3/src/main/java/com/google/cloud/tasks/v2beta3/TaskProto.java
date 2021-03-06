/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/task.proto

package com.google.cloud.tasks.v2beta3;

public final class TaskProto {
  private TaskProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_Task_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/tasks/v2beta3/task.proto\022"
          + "\032google.cloud.tasks.v2beta3\032\031google/api/"
          + "resource.proto\032\'google/cloud/tasks/v2bet"
          + "a3/target.proto\032\036google/protobuf/duratio"
          + "n.proto\032\037google/protobuf/timestamp.proto"
          + "\032\027google/rpc/status.proto\032\034google/api/an"
          + "notations.proto\"\315\005\n\004Task\022\014\n\004name\030\001 \001(\t\022S"
          + "\n\027app_engine_http_request\030\003 \001(\01320.google"
          + ".cloud.tasks.v2beta3.AppEngineHttpReques"
          + "tH\000\022?\n\014http_request\030\013 \001(\0132\'.google.cloud"
          + ".tasks.v2beta3.HttpRequestH\000\0221\n\rschedule"
          + "_time\030\004 \001(\0132\032.google.protobuf.Timestamp\022"
          + "/\n\013create_time\030\005 \001(\0132\032.google.protobuf.T"
          + "imestamp\0224\n\021dispatch_deadline\030\014 \001(\0132\031.go"
          + "ogle.protobuf.Duration\022\026\n\016dispatch_count"
          + "\030\006 \001(\005\022\026\n\016response_count\030\007 \001(\005\022:\n\rfirst_"
          + "attempt\030\010 \001(\0132#.google.cloud.tasks.v2bet"
          + "a3.Attempt\0229\n\014last_attempt\030\t \001(\0132#.googl"
          + "e.cloud.tasks.v2beta3.Attempt\0223\n\004view\030\n "
          + "\001(\0162%.google.cloud.tasks.v2beta3.Task.Vi"
          + "ew\"1\n\004View\022\024\n\020VIEW_UNSPECIFIED\020\000\022\t\n\005BASI"
          + "C\020\001\022\010\n\004FULL\020\002:h\352Ae\n\036cloudtasks.googleapi"
          + "s.com/Task\022Cprojects/{project}/locations"
          + "/{location}/queues/{queue}/tasks/{task}B"
          + "\016\n\014payload_type\"\317\001\n\007Attempt\0221\n\rschedule_"
          + "time\030\001 \001(\0132\032.google.protobuf.Timestamp\0221"
          + "\n\rdispatch_time\030\002 \001(\0132\032.google.protobuf."
          + "Timestamp\0221\n\rresponse_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022+\n\017response_status\030"
          + "\004 \001(\0132\022.google.rpc.StatusBn\n\036com.google."
          + "cloud.tasks.v2beta3B\tTaskProtoP\001Z?google"
          + ".golang.org/genproto/googleapis/cloud/ta"
          + "sks/v2beta3;tasksb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_tasks_v2beta3_Task_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta3_Task_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_Task_descriptor,
            new java.lang.String[] {
              "Name",
              "AppEngineHttpRequest",
              "HttpRequest",
              "ScheduleTime",
              "CreateTime",
              "DispatchDeadline",
              "DispatchCount",
              "ResponseCount",
              "FirstAttempt",
              "LastAttempt",
              "View",
              "PayloadType",
            });
    internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta3_Attempt_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta3_Attempt_descriptor,
            new java.lang.String[] {
              "ScheduleTime", "DispatchTime", "ResponseTime", "ResponseStatus",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.tasks.v2beta3.TargetProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
