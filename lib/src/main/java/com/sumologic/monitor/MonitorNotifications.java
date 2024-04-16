package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.115Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorNotifications")
@software.amazon.jsii.Jsii.Proxy(MonitorNotifications.Jsii$Proxy.class)
public interface MonitorNotifications extends software.amazon.jsii.JsiiSerializable {

    /**
     * notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification Monitor#notification}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorNotificationsNotification getNotification();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#run_for_trigger_types Monitor#run_for_trigger_types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getRunForTriggerTypes();

    /**
     * @return a {@link Builder} of {@link MonitorNotifications}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorNotifications}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorNotifications> {
        com.sumologic.monitor.MonitorNotificationsNotification notification;
        java.util.List<java.lang.String> runForTriggerTypes;

        /**
         * Sets the value of {@link MonitorNotifications#getNotification}
         * @param notification notification block. This parameter is required.
         *                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#notification Monitor#notification}
         * @return {@code this}
         */
        public Builder notification(com.sumologic.monitor.MonitorNotificationsNotification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotifications#getRunForTriggerTypes}
         * @param runForTriggerTypes Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#run_for_trigger_types Monitor#run_for_trigger_types}. This parameter is required.
         * @return {@code this}
         */
        public Builder runForTriggerTypes(java.util.List<java.lang.String> runForTriggerTypes) {
            this.runForTriggerTypes = runForTriggerTypes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorNotifications}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorNotifications build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorNotifications}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorNotifications {
        private final com.sumologic.monitor.MonitorNotificationsNotification notification;
        private final java.util.List<java.lang.String> runForTriggerTypes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.notification = software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorNotificationsNotification.class));
            this.runForTriggerTypes = software.amazon.jsii.Kernel.get(this, "runForTriggerTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.notification = java.util.Objects.requireNonNull(builder.notification, "notification is required");
            this.runForTriggerTypes = java.util.Objects.requireNonNull(builder.runForTriggerTypes, "runForTriggerTypes is required");
        }

        @Override
        public final com.sumologic.monitor.MonitorNotificationsNotification getNotification() {
            return this.notification;
        }

        @Override
        public final java.util.List<java.lang.String> getRunForTriggerTypes() {
            return this.runForTriggerTypes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("notification", om.valueToTree(this.getNotification()));
            data.set("runForTriggerTypes", om.valueToTree(this.getRunForTriggerTypes()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorNotifications"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorNotifications.Jsii$Proxy that = (MonitorNotifications.Jsii$Proxy) o;

            if (!notification.equals(that.notification)) return false;
            return this.runForTriggerTypes.equals(that.runForTriggerTypes);
        }

        @Override
        public final int hashCode() {
            int result = this.notification.hashCode();
            result = 31 * result + (this.runForTriggerTypes.hashCode());
            return result;
        }
    }
}
