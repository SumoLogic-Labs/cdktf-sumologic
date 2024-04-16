package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.074Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationServiceNowSearchNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationServiceNowSearchNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationServiceNowSearchNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#external_id LogSearch#external_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getExternalId();

    /**
     * fields block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#fields LogSearch#fields}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields getFields() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationServiceNowSearchNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationServiceNowSearchNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationServiceNowSearchNotification> {
        java.lang.String externalId;
        com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields fields;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotification#getExternalId}
         * @param externalId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#external_id LogSearch#external_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder externalId(java.lang.String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotification#getFields}
         * @param fields fields block.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#fields LogSearch#fields}
         * @return {@code this}
         */
        public Builder fields(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationServiceNowSearchNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationServiceNowSearchNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationServiceNowSearchNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationServiceNowSearchNotification {
        private final java.lang.String externalId;
        private final com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields fields;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.externalId = software.amazon.jsii.Kernel.get(this, "externalId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fields = software.amazon.jsii.Kernel.get(this, "fields", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.externalId = java.util.Objects.requireNonNull(builder.externalId, "externalId is required");
            this.fields = builder.fields;
        }

        @Override
        public final java.lang.String getExternalId() {
            return this.externalId;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotificationFields getFields() {
            return this.fields;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("externalId", om.valueToTree(this.getExternalId()));
            if (this.getFields() != null) {
                data.set("fields", om.valueToTree(this.getFields()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationServiceNowSearchNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationServiceNowSearchNotification.Jsii$Proxy that = (LogSearchScheduleNotificationServiceNowSearchNotification.Jsii$Proxy) o;

            if (!externalId.equals(that.externalId)) return false;
            return this.fields != null ? this.fields.equals(that.fields) : that.fields == null;
        }

        @Override
        public final int hashCode() {
            int result = this.externalId.hashCode();
            result = 31 * result + (this.fields != null ? this.fields.hashCode() : 0);
            return result;
        }
    }
}
