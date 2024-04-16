package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.073Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationEmailSearchNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationEmailSearchNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationEmailSearchNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#to_list LogSearch#to_list}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getToList();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_csv_attachment LogSearch#include_csv_attachment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeCsvAttachment() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_histogram LogSearch#include_histogram}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeHistogram() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_query LogSearch#include_query}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeQuery() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_result_set LogSearch#include_result_set}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeResultSet() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#subject_template LogSearch#subject_template}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubjectTemplate() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationEmailSearchNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationEmailSearchNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationEmailSearchNotification> {
        java.util.List<java.lang.String> toList;
        java.lang.Object includeCsvAttachment;
        java.lang.Object includeHistogram;
        java.lang.Object includeQuery;
        java.lang.Object includeResultSet;
        java.lang.String subjectTemplate;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getToList}
         * @param toList Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#to_list LogSearch#to_list}. This parameter is required.
         * @return {@code this}
         */
        public Builder toList(java.util.List<java.lang.String> toList) {
            this.toList = toList;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeCsvAttachment}
         * @param includeCsvAttachment Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_csv_attachment LogSearch#include_csv_attachment}.
         * @return {@code this}
         */
        public Builder includeCsvAttachment(java.lang.Boolean includeCsvAttachment) {
            this.includeCsvAttachment = includeCsvAttachment;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeCsvAttachment}
         * @param includeCsvAttachment Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_csv_attachment LogSearch#include_csv_attachment}.
         * @return {@code this}
         */
        public Builder includeCsvAttachment(com.hashicorp.cdktf.IResolvable includeCsvAttachment) {
            this.includeCsvAttachment = includeCsvAttachment;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeHistogram}
         * @param includeHistogram Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_histogram LogSearch#include_histogram}.
         * @return {@code this}
         */
        public Builder includeHistogram(java.lang.Boolean includeHistogram) {
            this.includeHistogram = includeHistogram;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeHistogram}
         * @param includeHistogram Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_histogram LogSearch#include_histogram}.
         * @return {@code this}
         */
        public Builder includeHistogram(com.hashicorp.cdktf.IResolvable includeHistogram) {
            this.includeHistogram = includeHistogram;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeQuery}
         * @param includeQuery Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_query LogSearch#include_query}.
         * @return {@code this}
         */
        public Builder includeQuery(java.lang.Boolean includeQuery) {
            this.includeQuery = includeQuery;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeQuery}
         * @param includeQuery Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_query LogSearch#include_query}.
         * @return {@code this}
         */
        public Builder includeQuery(com.hashicorp.cdktf.IResolvable includeQuery) {
            this.includeQuery = includeQuery;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeResultSet}
         * @param includeResultSet Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_result_set LogSearch#include_result_set}.
         * @return {@code this}
         */
        public Builder includeResultSet(java.lang.Boolean includeResultSet) {
            this.includeResultSet = includeResultSet;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getIncludeResultSet}
         * @param includeResultSet Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#include_result_set LogSearch#include_result_set}.
         * @return {@code this}
         */
        public Builder includeResultSet(com.hashicorp.cdktf.IResolvable includeResultSet) {
            this.includeResultSet = includeResultSet;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationEmailSearchNotification#getSubjectTemplate}
         * @param subjectTemplate Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#subject_template LogSearch#subject_template}.
         * @return {@code this}
         */
        public Builder subjectTemplate(java.lang.String subjectTemplate) {
            this.subjectTemplate = subjectTemplate;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationEmailSearchNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationEmailSearchNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationEmailSearchNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationEmailSearchNotification {
        private final java.util.List<java.lang.String> toList;
        private final java.lang.Object includeCsvAttachment;
        private final java.lang.Object includeHistogram;
        private final java.lang.Object includeQuery;
        private final java.lang.Object includeResultSet;
        private final java.lang.String subjectTemplate;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.toList = software.amazon.jsii.Kernel.get(this, "toList", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.includeCsvAttachment = software.amazon.jsii.Kernel.get(this, "includeCsvAttachment", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeHistogram = software.amazon.jsii.Kernel.get(this, "includeHistogram", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeQuery = software.amazon.jsii.Kernel.get(this, "includeQuery", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeResultSet = software.amazon.jsii.Kernel.get(this, "includeResultSet", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.subjectTemplate = software.amazon.jsii.Kernel.get(this, "subjectTemplate", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.toList = java.util.Objects.requireNonNull(builder.toList, "toList is required");
            this.includeCsvAttachment = builder.includeCsvAttachment;
            this.includeHistogram = builder.includeHistogram;
            this.includeQuery = builder.includeQuery;
            this.includeResultSet = builder.includeResultSet;
            this.subjectTemplate = builder.subjectTemplate;
        }

        @Override
        public final java.util.List<java.lang.String> getToList() {
            return this.toList;
        }

        @Override
        public final java.lang.Object getIncludeCsvAttachment() {
            return this.includeCsvAttachment;
        }

        @Override
        public final java.lang.Object getIncludeHistogram() {
            return this.includeHistogram;
        }

        @Override
        public final java.lang.Object getIncludeQuery() {
            return this.includeQuery;
        }

        @Override
        public final java.lang.Object getIncludeResultSet() {
            return this.includeResultSet;
        }

        @Override
        public final java.lang.String getSubjectTemplate() {
            return this.subjectTemplate;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("toList", om.valueToTree(this.getToList()));
            if (this.getIncludeCsvAttachment() != null) {
                data.set("includeCsvAttachment", om.valueToTree(this.getIncludeCsvAttachment()));
            }
            if (this.getIncludeHistogram() != null) {
                data.set("includeHistogram", om.valueToTree(this.getIncludeHistogram()));
            }
            if (this.getIncludeQuery() != null) {
                data.set("includeQuery", om.valueToTree(this.getIncludeQuery()));
            }
            if (this.getIncludeResultSet() != null) {
                data.set("includeResultSet", om.valueToTree(this.getIncludeResultSet()));
            }
            if (this.getSubjectTemplate() != null) {
                data.set("subjectTemplate", om.valueToTree(this.getSubjectTemplate()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationEmailSearchNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationEmailSearchNotification.Jsii$Proxy that = (LogSearchScheduleNotificationEmailSearchNotification.Jsii$Proxy) o;

            if (!toList.equals(that.toList)) return false;
            if (this.includeCsvAttachment != null ? !this.includeCsvAttachment.equals(that.includeCsvAttachment) : that.includeCsvAttachment != null) return false;
            if (this.includeHistogram != null ? !this.includeHistogram.equals(that.includeHistogram) : that.includeHistogram != null) return false;
            if (this.includeQuery != null ? !this.includeQuery.equals(that.includeQuery) : that.includeQuery != null) return false;
            if (this.includeResultSet != null ? !this.includeResultSet.equals(that.includeResultSet) : that.includeResultSet != null) return false;
            return this.subjectTemplate != null ? this.subjectTemplate.equals(that.subjectTemplate) : that.subjectTemplate == null;
        }

        @Override
        public final int hashCode() {
            int result = this.toList.hashCode();
            result = 31 * result + (this.includeCsvAttachment != null ? this.includeCsvAttachment.hashCode() : 0);
            result = 31 * result + (this.includeHistogram != null ? this.includeHistogram.hashCode() : 0);
            result = 31 * result + (this.includeQuery != null ? this.includeQuery.hashCode() : 0);
            result = 31 * result + (this.includeResultSet != null ? this.includeResultSet.hashCode() : 0);
            result = 31 * result + (this.subjectTemplate != null ? this.subjectTemplate.hashCode() : 0);
            return result;
        }
    }
}
