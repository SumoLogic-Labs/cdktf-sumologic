package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.071Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchSchedule")
@software.amazon.jsii.Jsii.Proxy(LogSearchSchedule.Jsii$Proxy.class)
public interface LogSearchSchedule extends software.amazon.jsii.JsiiSerializable {

    /**
     * notification block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#notification LogSearch#notification}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleNotification getNotification();

    /**
     * parseable_time_range block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#parseable_time_range LogSearch#parseable_time_range}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.log_search.LogSearchScheduleParseableTimeRange getParseableTimeRange();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#schedule_type LogSearch#schedule_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getScheduleType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#time_zone LogSearch#time_zone}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeZone();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#cron_expression LogSearch#cron_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getCronExpression() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#mute_error_emails LogSearch#mute_error_emails}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getMuteErrorEmails() {
        return null;
    }

    /**
     * parameter block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#parameter LogSearch#parameter}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getParameter() {
        return null;
    }

    /**
     * threshold block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#threshold LogSearch#threshold}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.log_search.LogSearchScheduleThreshold getThreshold() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchSchedule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchSchedule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchSchedule> {
        com.sumologic.log_search.LogSearchScheduleNotification notification;
        com.sumologic.log_search.LogSearchScheduleParseableTimeRange parseableTimeRange;
        java.lang.String scheduleType;
        java.lang.String timeZone;
        java.lang.String cronExpression;
        java.lang.Object muteErrorEmails;
        java.lang.Object parameter;
        com.sumologic.log_search.LogSearchScheduleThreshold threshold;

        /**
         * Sets the value of {@link LogSearchSchedule#getNotification}
         * @param notification notification block. This parameter is required.
         *                     Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#notification LogSearch#notification}
         * @return {@code this}
         */
        public Builder notification(com.sumologic.log_search.LogSearchScheduleNotification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getParseableTimeRange}
         * @param parseableTimeRange parseable_time_range block. This parameter is required.
         *                           Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#parseable_time_range LogSearch#parseable_time_range}
         * @return {@code this}
         */
        public Builder parseableTimeRange(com.sumologic.log_search.LogSearchScheduleParseableTimeRange parseableTimeRange) {
            this.parseableTimeRange = parseableTimeRange;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getScheduleType}
         * @param scheduleType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#schedule_type LogSearch#schedule_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder scheduleType(java.lang.String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getTimeZone}
         * @param timeZone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#time_zone LogSearch#time_zone}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeZone(java.lang.String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getCronExpression}
         * @param cronExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#cron_expression LogSearch#cron_expression}.
         * @return {@code this}
         */
        public Builder cronExpression(java.lang.String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getMuteErrorEmails}
         * @param muteErrorEmails Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#mute_error_emails LogSearch#mute_error_emails}.
         * @return {@code this}
         */
        public Builder muteErrorEmails(java.lang.Boolean muteErrorEmails) {
            this.muteErrorEmails = muteErrorEmails;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getMuteErrorEmails}
         * @param muteErrorEmails Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#mute_error_emails LogSearch#mute_error_emails}.
         * @return {@code this}
         */
        public Builder muteErrorEmails(com.hashicorp.cdktf.IResolvable muteErrorEmails) {
            this.muteErrorEmails = muteErrorEmails;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getParameter}
         * @param parameter parameter block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#parameter LogSearch#parameter}
         * @return {@code this}
         */
        public Builder parameter(com.hashicorp.cdktf.IResolvable parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getParameter}
         * @param parameter parameter block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#parameter LogSearch#parameter}
         * @return {@code this}
         */
        public Builder parameter(java.util.List<? extends com.sumologic.log_search.LogSearchScheduleParameter> parameter) {
            this.parameter = parameter;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchSchedule#getThreshold}
         * @param threshold threshold block.
         *                  Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#threshold LogSearch#threshold}
         * @return {@code this}
         */
        public Builder threshold(com.sumologic.log_search.LogSearchScheduleThreshold threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchSchedule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchSchedule build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchSchedule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchSchedule {
        private final com.sumologic.log_search.LogSearchScheduleNotification notification;
        private final com.sumologic.log_search.LogSearchScheduleParseableTimeRange parseableTimeRange;
        private final java.lang.String scheduleType;
        private final java.lang.String timeZone;
        private final java.lang.String cronExpression;
        private final java.lang.Object muteErrorEmails;
        private final java.lang.Object parameter;
        private final com.sumologic.log_search.LogSearchScheduleThreshold threshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.notification = software.amazon.jsii.Kernel.get(this, "notification", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleNotification.class));
            this.parseableTimeRange = software.amazon.jsii.Kernel.get(this, "parseableTimeRange", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleParseableTimeRange.class));
            this.scheduleType = software.amazon.jsii.Kernel.get(this, "scheduleType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeZone = software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.cronExpression = software.amazon.jsii.Kernel.get(this, "cronExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.muteErrorEmails = software.amazon.jsii.Kernel.get(this, "muteErrorEmails", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.parameter = software.amazon.jsii.Kernel.get(this, "parameter", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(com.sumologic.log_search.LogSearchScheduleThreshold.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.notification = java.util.Objects.requireNonNull(builder.notification, "notification is required");
            this.parseableTimeRange = java.util.Objects.requireNonNull(builder.parseableTimeRange, "parseableTimeRange is required");
            this.scheduleType = java.util.Objects.requireNonNull(builder.scheduleType, "scheduleType is required");
            this.timeZone = java.util.Objects.requireNonNull(builder.timeZone, "timeZone is required");
            this.cronExpression = builder.cronExpression;
            this.muteErrorEmails = builder.muteErrorEmails;
            this.parameter = builder.parameter;
            this.threshold = builder.threshold;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleNotification getNotification() {
            return this.notification;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleParseableTimeRange getParseableTimeRange() {
            return this.parseableTimeRange;
        }

        @Override
        public final java.lang.String getScheduleType() {
            return this.scheduleType;
        }

        @Override
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        @Override
        public final java.lang.String getCronExpression() {
            return this.cronExpression;
        }

        @Override
        public final java.lang.Object getMuteErrorEmails() {
            return this.muteErrorEmails;
        }

        @Override
        public final java.lang.Object getParameter() {
            return this.parameter;
        }

        @Override
        public final com.sumologic.log_search.LogSearchScheduleThreshold getThreshold() {
            return this.threshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("notification", om.valueToTree(this.getNotification()));
            data.set("parseableTimeRange", om.valueToTree(this.getParseableTimeRange()));
            data.set("scheduleType", om.valueToTree(this.getScheduleType()));
            data.set("timeZone", om.valueToTree(this.getTimeZone()));
            if (this.getCronExpression() != null) {
                data.set("cronExpression", om.valueToTree(this.getCronExpression()));
            }
            if (this.getMuteErrorEmails() != null) {
                data.set("muteErrorEmails", om.valueToTree(this.getMuteErrorEmails()));
            }
            if (this.getParameter() != null) {
                data.set("parameter", om.valueToTree(this.getParameter()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchSchedule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchSchedule.Jsii$Proxy that = (LogSearchSchedule.Jsii$Proxy) o;

            if (!notification.equals(that.notification)) return false;
            if (!parseableTimeRange.equals(that.parseableTimeRange)) return false;
            if (!scheduleType.equals(that.scheduleType)) return false;
            if (!timeZone.equals(that.timeZone)) return false;
            if (this.cronExpression != null ? !this.cronExpression.equals(that.cronExpression) : that.cronExpression != null) return false;
            if (this.muteErrorEmails != null ? !this.muteErrorEmails.equals(that.muteErrorEmails) : that.muteErrorEmails != null) return false;
            if (this.parameter != null ? !this.parameter.equals(that.parameter) : that.parameter != null) return false;
            return this.threshold != null ? this.threshold.equals(that.threshold) : that.threshold == null;
        }

        @Override
        public final int hashCode() {
            int result = this.notification.hashCode();
            result = 31 * result + (this.parseableTimeRange.hashCode());
            result = 31 * result + (this.scheduleType.hashCode());
            result = 31 * result + (this.timeZone.hashCode());
            result = 31 * result + (this.cronExpression != null ? this.cronExpression.hashCode() : 0);
            result = 31 * result + (this.muteErrorEmails != null ? this.muteErrorEmails.hashCode() : 0);
            result = 31 * result + (this.parameter != null ? this.parameter.hashCode() : 0);
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            return result;
        }
    }
}
