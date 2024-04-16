package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.120Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarning")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsLogsStaticConditionWarning.Jsii$Proxy.class)
public interface MonitorTriggerConditionsLogsStaticConditionWarning extends software.amazon.jsii.JsiiSerializable {

    /**
     * alert block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert getAlert();

    /**
     * resolution block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution getResolution();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimeRange();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsLogsStaticConditionWarning}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsLogsStaticConditionWarning}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsLogsStaticConditionWarning> {
        com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert alert;
        com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution resolution;
        java.lang.String timeRange;

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionWarning#getAlert}
         * @param alert alert block. This parameter is required.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#alert Monitor#alert}
         * @return {@code this}
         */
        public Builder alert(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert alert) {
            this.alert = alert;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionWarning#getResolution}
         * @param resolution resolution block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution Monitor#resolution}
         * @return {@code this}
         */
        public Builder resolution(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution resolution) {
            this.resolution = resolution;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionWarning#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}. This parameter is required.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsLogsStaticConditionWarning}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsLogsStaticConditionWarning build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsLogsStaticConditionWarning}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsLogsStaticConditionWarning {
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert alert;
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution resolution;
        private final java.lang.String timeRange;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.alert = software.amazon.jsii.Kernel.get(this, "alert", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert.class));
            this.resolution = software.amazon.jsii.Kernel.get(this, "resolution", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.alert = java.util.Objects.requireNonNull(builder.alert, "alert is required");
            this.resolution = java.util.Objects.requireNonNull(builder.resolution, "resolution is required");
            this.timeRange = java.util.Objects.requireNonNull(builder.timeRange, "timeRange is required");
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningAlert getAlert() {
            return this.alert;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarningResolution getResolution() {
            return this.resolution;
        }

        @Override
        public final java.lang.String getTimeRange() {
            return this.timeRange;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("alert", om.valueToTree(this.getAlert()));
            data.set("resolution", om.valueToTree(this.getResolution()));
            data.set("timeRange", om.valueToTree(this.getTimeRange()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionWarning"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsLogsStaticConditionWarning.Jsii$Proxy that = (MonitorTriggerConditionsLogsStaticConditionWarning.Jsii$Proxy) o;

            if (!alert.equals(that.alert)) return false;
            if (!resolution.equals(that.resolution)) return false;
            return this.timeRange.equals(that.timeRange);
        }

        @Override
        public final int hashCode() {
            int result = this.alert.hashCode();
            result = 31 * result + (this.resolution.hashCode());
            result = 31 * result + (this.timeRange.hashCode());
            return result;
        }
    }
}
