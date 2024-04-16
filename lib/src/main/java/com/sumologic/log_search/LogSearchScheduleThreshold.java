package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.090Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleThreshold")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleThreshold.Jsii$Proxy.class)
public interface LogSearchScheduleThreshold extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#count LogSearch#count}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCount();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#operator LogSearch#operator}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOperator();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#threshold_type LogSearch#threshold_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getThresholdType();

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleThreshold}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleThreshold}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleThreshold> {
        java.lang.Number count;
        java.lang.String operator;
        java.lang.String thresholdType;

        /**
         * Sets the value of {@link LogSearchScheduleThreshold#getCount}
         * @param count Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#count LogSearch#count}. This parameter is required.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleThreshold#getOperator}
         * @param operator Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#operator LogSearch#operator}. This parameter is required.
         * @return {@code this}
         */
        public Builder operator(java.lang.String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleThreshold#getThresholdType}
         * @param thresholdType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#threshold_type LogSearch#threshold_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder thresholdType(java.lang.String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleThreshold}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleThreshold build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleThreshold}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleThreshold {
        private final java.lang.Number count;
        private final java.lang.String operator;
        private final java.lang.String thresholdType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.operator = software.amazon.jsii.Kernel.get(this, "operator", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.thresholdType = software.amazon.jsii.Kernel.get(this, "thresholdType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = java.util.Objects.requireNonNull(builder.count, "count is required");
            this.operator = java.util.Objects.requireNonNull(builder.operator, "operator is required");
            this.thresholdType = java.util.Objects.requireNonNull(builder.thresholdType, "thresholdType is required");
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.lang.String getOperator() {
            return this.operator;
        }

        @Override
        public final java.lang.String getThresholdType() {
            return this.thresholdType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("count", om.valueToTree(this.getCount()));
            data.set("operator", om.valueToTree(this.getOperator()));
            data.set("thresholdType", om.valueToTree(this.getThresholdType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleThreshold"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleThreshold.Jsii$Proxy that = (LogSearchScheduleThreshold.Jsii$Proxy) o;

            if (!count.equals(that.count)) return false;
            if (!operator.equals(that.operator)) return false;
            return this.thresholdType.equals(that.thresholdType);
        }

        @Override
        public final int hashCode() {
            int result = this.count.hashCode();
            result = 31 * result + (this.operator.hashCode());
            result = 31 * result + (this.thresholdType.hashCode());
            return result;
        }
    }
}
