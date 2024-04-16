package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.074Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationSaveToLookupNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationSaveToLookupNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationSaveToLookupNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#is_lookup_merge_operation LogSearch#is_lookup_merge_operation}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getIsLookupMergeOperation();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#lookup_file_path LogSearch#lookup_file_path}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getLookupFilePath();

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationSaveToLookupNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationSaveToLookupNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationSaveToLookupNotification> {
        java.lang.Object isLookupMergeOperation;
        java.lang.String lookupFilePath;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationSaveToLookupNotification#getIsLookupMergeOperation}
         * @param isLookupMergeOperation Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#is_lookup_merge_operation LogSearch#is_lookup_merge_operation}. This parameter is required.
         * @return {@code this}
         */
        public Builder isLookupMergeOperation(java.lang.Boolean isLookupMergeOperation) {
            this.isLookupMergeOperation = isLookupMergeOperation;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationSaveToLookupNotification#getIsLookupMergeOperation}
         * @param isLookupMergeOperation Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#is_lookup_merge_operation LogSearch#is_lookup_merge_operation}. This parameter is required.
         * @return {@code this}
         */
        public Builder isLookupMergeOperation(com.hashicorp.cdktf.IResolvable isLookupMergeOperation) {
            this.isLookupMergeOperation = isLookupMergeOperation;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationSaveToLookupNotification#getLookupFilePath}
         * @param lookupFilePath Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#lookup_file_path LogSearch#lookup_file_path}. This parameter is required.
         * @return {@code this}
         */
        public Builder lookupFilePath(java.lang.String lookupFilePath) {
            this.lookupFilePath = lookupFilePath;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationSaveToLookupNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationSaveToLookupNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationSaveToLookupNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationSaveToLookupNotification {
        private final java.lang.Object isLookupMergeOperation;
        private final java.lang.String lookupFilePath;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.isLookupMergeOperation = software.amazon.jsii.Kernel.get(this, "isLookupMergeOperation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.lookupFilePath = software.amazon.jsii.Kernel.get(this, "lookupFilePath", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.isLookupMergeOperation = java.util.Objects.requireNonNull(builder.isLookupMergeOperation, "isLookupMergeOperation is required");
            this.lookupFilePath = java.util.Objects.requireNonNull(builder.lookupFilePath, "lookupFilePath is required");
        }

        @Override
        public final java.lang.Object getIsLookupMergeOperation() {
            return this.isLookupMergeOperation;
        }

        @Override
        public final java.lang.String getLookupFilePath() {
            return this.lookupFilePath;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("isLookupMergeOperation", om.valueToTree(this.getIsLookupMergeOperation()));
            data.set("lookupFilePath", om.valueToTree(this.getLookupFilePath()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationSaveToLookupNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationSaveToLookupNotification.Jsii$Proxy that = (LogSearchScheduleNotificationSaveToLookupNotification.Jsii$Proxy) o;

            if (!isLookupMergeOperation.equals(that.isLookupMergeOperation)) return false;
            return this.lookupFilePath.equals(that.lookupFilePath);
        }

        @Override
        public final int hashCode() {
            int result = this.isLookupMergeOperation.hashCode();
            result = 31 * result + (this.lookupFilePath.hashCode());
            return result;
        }
    }
}
