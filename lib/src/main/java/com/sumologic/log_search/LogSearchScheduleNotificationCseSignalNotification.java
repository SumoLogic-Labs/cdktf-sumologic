package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.073Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationCseSignalNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationCseSignalNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationCseSignalNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#record_type LogSearch#record_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRecordType();

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationCseSignalNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationCseSignalNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationCseSignalNotification> {
        java.lang.String recordType;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationCseSignalNotification#getRecordType}
         * @param recordType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#record_type LogSearch#record_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder recordType(java.lang.String recordType) {
            this.recordType = recordType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationCseSignalNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationCseSignalNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationCseSignalNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationCseSignalNotification {
        private final java.lang.String recordType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.recordType = software.amazon.jsii.Kernel.get(this, "recordType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.recordType = java.util.Objects.requireNonNull(builder.recordType, "recordType is required");
        }

        @Override
        public final java.lang.String getRecordType() {
            return this.recordType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("recordType", om.valueToTree(this.getRecordType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationCseSignalNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationCseSignalNotification.Jsii$Proxy that = (LogSearchScheduleNotificationCseSignalNotification.Jsii$Proxy) o;

            return this.recordType.equals(that.recordType);
        }

        @Override
        public final int hashCode() {
            int result = this.recordType.hashCode();
            return result;
        }
    }
}
