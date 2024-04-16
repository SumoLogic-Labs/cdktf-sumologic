package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.074Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationSaveToViewNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationSaveToViewNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationSaveToViewNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#view_name LogSearch#view_name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getViewName();

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationSaveToViewNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationSaveToViewNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationSaveToViewNotification> {
        java.lang.String viewName;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationSaveToViewNotification#getViewName}
         * @param viewName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#view_name LogSearch#view_name}. This parameter is required.
         * @return {@code this}
         */
        public Builder viewName(java.lang.String viewName) {
            this.viewName = viewName;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationSaveToViewNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationSaveToViewNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationSaveToViewNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationSaveToViewNotification {
        private final java.lang.String viewName;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.viewName = software.amazon.jsii.Kernel.get(this, "viewName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.viewName = java.util.Objects.requireNonNull(builder.viewName, "viewName is required");
        }

        @Override
        public final java.lang.String getViewName() {
            return this.viewName;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("viewName", om.valueToTree(this.getViewName()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationSaveToViewNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationSaveToViewNotification.Jsii$Proxy that = (LogSearchScheduleNotificationSaveToViewNotification.Jsii$Proxy) o;

            return this.viewName.equals(that.viewName);
        }

        @Override
        public final int hashCode() {
            int result = this.viewName.hashCode();
            return result;
        }
    }
}
