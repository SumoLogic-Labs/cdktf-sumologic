package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.072Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotification")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotification.Jsii$Proxy.class)
public interface LogSearchScheduleNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * alert_search_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#alert_search_notification LogSearch#alert_search_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification getAlertSearchNotification() {
        return null;
    }

    /**
     * cse_signal_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#cse_signal_notification LogSearch#cse_signal_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification getCseSignalNotification() {
        return null;
    }

    /**
     * email_search_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#email_search_notification LogSearch#email_search_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification getEmailSearchNotification() {
        return null;
    }

    /**
     * save_to_lookup_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#save_to_lookup_notification LogSearch#save_to_lookup_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification getSaveToLookupNotification() {
        return null;
    }

    /**
     * save_to_view_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#save_to_view_notification LogSearch#save_to_view_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification getSaveToViewNotification() {
        return null;
    }

    /**
     * service_now_search_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#service_now_search_notification LogSearch#service_now_search_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification getServiceNowSearchNotification() {
        return null;
    }

    /**
     * webhook_search_notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#webhook_search_notification LogSearch#webhook_search_notification}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification getWebhookSearchNotification() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotification> {
        com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification alertSearchNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification cseSignalNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification emailSearchNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification saveToLookupNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification saveToViewNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification serviceNowSearchNotification;
        com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification webhookSearchNotification;

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getAlertSearchNotification}
         * @param alertSearchNotification alert_search_notification block.
         *                                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#alert_search_notification LogSearch#alert_search_notification}
         * @return {@code this}
         */
        public Builder alertSearchNotification(com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification alertSearchNotification) {
            this.alertSearchNotification = alertSearchNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getCseSignalNotification}
         * @param cseSignalNotification cse_signal_notification block.
         *                              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#cse_signal_notification LogSearch#cse_signal_notification}
         * @return {@code this}
         */
        public Builder cseSignalNotification(com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification cseSignalNotification) {
            this.cseSignalNotification = cseSignalNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getEmailSearchNotification}
         * @param emailSearchNotification email_search_notification block.
         *                                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#email_search_notification LogSearch#email_search_notification}
         * @return {@code this}
         */
        public Builder emailSearchNotification(com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification emailSearchNotification) {
            this.emailSearchNotification = emailSearchNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getSaveToLookupNotification}
         * @param saveToLookupNotification save_to_lookup_notification block.
         *                                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#save_to_lookup_notification LogSearch#save_to_lookup_notification}
         * @return {@code this}
         */
        public Builder saveToLookupNotification(com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification saveToLookupNotification) {
            this.saveToLookupNotification = saveToLookupNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getSaveToViewNotification}
         * @param saveToViewNotification save_to_view_notification block.
         *                               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#save_to_view_notification LogSearch#save_to_view_notification}
         * @return {@code this}
         */
        public Builder saveToViewNotification(com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification saveToViewNotification) {
            this.saveToViewNotification = saveToViewNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getServiceNowSearchNotification}
         * @param serviceNowSearchNotification service_now_search_notification block.
         *                                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#service_now_search_notification LogSearch#service_now_search_notification}
         * @return {@code this}
         */
        public Builder serviceNowSearchNotification(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification serviceNowSearchNotification) {
            this.serviceNowSearchNotification = serviceNowSearchNotification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotification#getWebhookSearchNotification}
         * @param webhookSearchNotification webhook_search_notification block.
         *                                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#webhook_search_notification LogSearch#webhook_search_notification}
         * @return {@code this}
         */
        public Builder webhookSearchNotification(com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification webhookSearchNotification) {
            this.webhookSearchNotification = webhookSearchNotification;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotification {
        private final com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification alertSearchNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification cseSignalNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification emailSearchNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification saveToLookupNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification saveToViewNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification serviceNowSearchNotification;
        private final com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification webhookSearchNotification;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alertSearchNotification = software.amazon.jsii.Kernel.get(this, "alertSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification.class));
            this.cseSignalNotification = software.amazon.jsii.Kernel.get(this, "cseSignalNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification.class));
            this.emailSearchNotification = software.amazon.jsii.Kernel.get(this, "emailSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification.class));
            this.saveToLookupNotification = software.amazon.jsii.Kernel.get(this, "saveToLookupNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification.class));
            this.saveToViewNotification = software.amazon.jsii.Kernel.get(this, "saveToViewNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification.class));
            this.serviceNowSearchNotification = software.amazon.jsii.Kernel.get(this, "serviceNowSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification.class));
            this.webhookSearchNotification = software.amazon.jsii.Kernel.get(this, "webhookSearchNotification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alertSearchNotification = builder.alertSearchNotification;
            this.cseSignalNotification = builder.cseSignalNotification;
            this.emailSearchNotification = builder.emailSearchNotification;
            this.saveToLookupNotification = builder.saveToLookupNotification;
            this.saveToViewNotification = builder.saveToViewNotification;
            this.serviceNowSearchNotification = builder.serviceNowSearchNotification;
            this.webhookSearchNotification = builder.webhookSearchNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationAlertSearchNotification getAlertSearchNotification() {
            return this.alertSearchNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationCseSignalNotification getCseSignalNotification() {
            return this.cseSignalNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationEmailSearchNotification getEmailSearchNotification() {
            return this.emailSearchNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationSaveToLookupNotification getSaveToLookupNotification() {
            return this.saveToLookupNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationSaveToViewNotification getSaveToViewNotification() {
            return this.saveToViewNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationServiceNowSearchNotification getServiceNowSearchNotification() {
            return this.serviceNowSearchNotification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotificationWebhookSearchNotification getWebhookSearchNotification() {
            return this.webhookSearchNotification;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getAlertSearchNotification() != null) {
                data.set("alertSearchNotification", om.valueToTree(this.getAlertSearchNotification()));
            }
            if (this.getCseSignalNotification() != null) {
                data.set("cseSignalNotification", om.valueToTree(this.getCseSignalNotification()));
            }
            if (this.getEmailSearchNotification() != null) {
                data.set("emailSearchNotification", om.valueToTree(this.getEmailSearchNotification()));
            }
            if (this.getSaveToLookupNotification() != null) {
                data.set("saveToLookupNotification", om.valueToTree(this.getSaveToLookupNotification()));
            }
            if (this.getSaveToViewNotification() != null) {
                data.set("saveToViewNotification", om.valueToTree(this.getSaveToViewNotification()));
            }
            if (this.getServiceNowSearchNotification() != null) {
                data.set("serviceNowSearchNotification", om.valueToTree(this.getServiceNowSearchNotification()));
            }
            if (this.getWebhookSearchNotification() != null) {
                data.set("webhookSearchNotification", om.valueToTree(this.getWebhookSearchNotification()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotification.Jsii$Proxy that = (LogSearchScheduleNotification.Jsii$Proxy) o;

            if (this.alertSearchNotification != null ? !this.alertSearchNotification.equals(that.alertSearchNotification) : that.alertSearchNotification != null) return false;
            if (this.cseSignalNotification != null ? !this.cseSignalNotification.equals(that.cseSignalNotification) : that.cseSignalNotification != null) return false;
            if (this.emailSearchNotification != null ? !this.emailSearchNotification.equals(that.emailSearchNotification) : that.emailSearchNotification != null) return false;
            if (this.saveToLookupNotification != null ? !this.saveToLookupNotification.equals(that.saveToLookupNotification) : that.saveToLookupNotification != null) return false;
            if (this.saveToViewNotification != null ? !this.saveToViewNotification.equals(that.saveToViewNotification) : that.saveToViewNotification != null) return false;
            if (this.serviceNowSearchNotification != null ? !this.serviceNowSearchNotification.equals(that.serviceNowSearchNotification) : that.serviceNowSearchNotification != null) return false;
            return this.webhookSearchNotification != null ? this.webhookSearchNotification.equals(that.webhookSearchNotification) : that.webhookSearchNotification == null;
        }

        @Override
        public final int hashCode() {
            int result = this.alertSearchNotification != null ? this.alertSearchNotification.hashCode() : 0;
            result = 31 * result + (this.cseSignalNotification != null ? this.cseSignalNotification.hashCode() : 0);
            result = 31 * result + (this.emailSearchNotification != null ? this.emailSearchNotification.hashCode() : 0);
            result = 31 * result + (this.saveToLookupNotification != null ? this.saveToLookupNotification.hashCode() : 0);
            result = 31 * result + (this.saveToViewNotification != null ? this.saveToViewNotification.hashCode() : 0);
            result = 31 * result + (this.serviceNowSearchNotification != null ? this.serviceNowSearchNotification.hashCode() : 0);
            result = 31 * result + (this.webhookSearchNotification != null ? this.webhookSearchNotification.hashCode() : 0);
            return result;
        }
    }
}
