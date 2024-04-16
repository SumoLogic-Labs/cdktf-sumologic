package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.085Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationWebhookSearchNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationWebhookSearchNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationWebhookSearchNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#webhook_id LogSearch#webhook_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getWebhookId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#itemize_alerts LogSearch#itemize_alerts}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getItemizeAlerts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#max_itemized_alerts LogSearch#max_itemized_alerts}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMaxItemizedAlerts() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#payload LogSearch#payload}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPayload() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationWebhookSearchNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationWebhookSearchNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationWebhookSearchNotification> {
        java.lang.String webhookId;
        java.lang.Object itemizeAlerts;
        java.lang.Number maxItemizedAlerts;
        java.lang.String payload;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationWebhookSearchNotification#getWebhookId}
         * @param webhookId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#webhook_id LogSearch#webhook_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder webhookId(java.lang.String webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationWebhookSearchNotification#getItemizeAlerts}
         * @param itemizeAlerts Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#itemize_alerts LogSearch#itemize_alerts}.
         * @return {@code this}
         */
        public Builder itemizeAlerts(java.lang.Boolean itemizeAlerts) {
            this.itemizeAlerts = itemizeAlerts;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationWebhookSearchNotification#getItemizeAlerts}
         * @param itemizeAlerts Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#itemize_alerts LogSearch#itemize_alerts}.
         * @return {@code this}
         */
        public Builder itemizeAlerts(com.hashicorp.cdktf.IResolvable itemizeAlerts) {
            this.itemizeAlerts = itemizeAlerts;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationWebhookSearchNotification#getMaxItemizedAlerts}
         * @param maxItemizedAlerts Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#max_itemized_alerts LogSearch#max_itemized_alerts}.
         * @return {@code this}
         */
        public Builder maxItemizedAlerts(java.lang.Number maxItemizedAlerts) {
            this.maxItemizedAlerts = maxItemizedAlerts;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationWebhookSearchNotification#getPayload}
         * @param payload Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#payload LogSearch#payload}.
         * @return {@code this}
         */
        public Builder payload(java.lang.String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationWebhookSearchNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationWebhookSearchNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationWebhookSearchNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationWebhookSearchNotification {
        private final java.lang.String webhookId;
        private final java.lang.Object itemizeAlerts;
        private final java.lang.Number maxItemizedAlerts;
        private final java.lang.String payload;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.webhookId = software.amazon.jsii.Kernel.get(this, "webhookId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.itemizeAlerts = software.amazon.jsii.Kernel.get(this, "itemizeAlerts", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.maxItemizedAlerts = software.amazon.jsii.Kernel.get(this, "maxItemizedAlerts", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.payload = software.amazon.jsii.Kernel.get(this, "payload", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.webhookId = java.util.Objects.requireNonNull(builder.webhookId, "webhookId is required");
            this.itemizeAlerts = builder.itemizeAlerts;
            this.maxItemizedAlerts = builder.maxItemizedAlerts;
            this.payload = builder.payload;
        }

        @Override
        public final java.lang.String getWebhookId() {
            return this.webhookId;
        }

        @Override
        public final java.lang.Object getItemizeAlerts() {
            return this.itemizeAlerts;
        }

        @Override
        public final java.lang.Number getMaxItemizedAlerts() {
            return this.maxItemizedAlerts;
        }

        @Override
        public final java.lang.String getPayload() {
            return this.payload;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("webhookId", om.valueToTree(this.getWebhookId()));
            if (this.getItemizeAlerts() != null) {
                data.set("itemizeAlerts", om.valueToTree(this.getItemizeAlerts()));
            }
            if (this.getMaxItemizedAlerts() != null) {
                data.set("maxItemizedAlerts", om.valueToTree(this.getMaxItemizedAlerts()));
            }
            if (this.getPayload() != null) {
                data.set("payload", om.valueToTree(this.getPayload()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationWebhookSearchNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationWebhookSearchNotification.Jsii$Proxy that = (LogSearchScheduleNotificationWebhookSearchNotification.Jsii$Proxy) o;

            if (!webhookId.equals(that.webhookId)) return false;
            if (this.itemizeAlerts != null ? !this.itemizeAlerts.equals(that.itemizeAlerts) : that.itemizeAlerts != null) return false;
            if (this.maxItemizedAlerts != null ? !this.maxItemizedAlerts.equals(that.maxItemizedAlerts) : that.maxItemizedAlerts != null) return false;
            return this.payload != null ? this.payload.equals(that.payload) : that.payload == null;
        }

        @Override
        public final int hashCode() {
            int result = this.webhookId.hashCode();
            result = 31 * result + (this.itemizeAlerts != null ? this.itemizeAlerts.hashCode() : 0);
            result = 31 * result + (this.maxItemizedAlerts != null ? this.maxItemizedAlerts.hashCode() : 0);
            result = 31 * result + (this.payload != null ? this.payload.hashCode() : 0);
            return result;
        }
    }
}
