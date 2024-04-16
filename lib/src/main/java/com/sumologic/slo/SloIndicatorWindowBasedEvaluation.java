package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.212Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorWindowBasedEvaluation")
@software.amazon.jsii.Jsii.Proxy(SloIndicatorWindowBasedEvaluation.Jsii$Proxy.class)
public interface SloIndicatorWindowBasedEvaluation extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#op Slo#op}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getOp();

    /**
     * queries block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#queries Slo#queries}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getQueries();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_type Slo#query_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQueryType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#size Slo#size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSize();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#threshold Slo#threshold}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getThreshold();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#aggregation Slo#aggregation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAggregation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloIndicatorWindowBasedEvaluation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicatorWindowBasedEvaluation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicatorWindowBasedEvaluation> {
        java.lang.String op;
        java.lang.Object queries;
        java.lang.String queryType;
        java.lang.String size;
        java.lang.Number threshold;
        java.lang.String aggregation;

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getOp}
         * @param op Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#op Slo#op}. This parameter is required.
         * @return {@code this}
         */
        public Builder op(java.lang.String op) {
            this.op = op;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getQueries}
         * @param queries queries block. This parameter is required.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#queries Slo#queries}
         * @return {@code this}
         */
        public Builder queries(com.hashicorp.cdktf.IResolvable queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getQueries}
         * @param queries queries block. This parameter is required.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#queries Slo#queries}
         * @return {@code this}
         */
        public Builder queries(java.util.List<? extends com.sumologic.slo.SloIndicatorWindowBasedEvaluationQueries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getQueryType}
         * @param queryType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_type Slo#query_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryType(java.lang.String queryType) {
            this.queryType = queryType;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getSize}
         * @param size Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#size Slo#size}. This parameter is required.
         * @return {@code this}
         */
        public Builder size(java.lang.String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#threshold Slo#threshold}. This parameter is required.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluation#getAggregation}
         * @param aggregation Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#aggregation Slo#aggregation}.
         * @return {@code this}
         */
        public Builder aggregation(java.lang.String aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicatorWindowBasedEvaluation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicatorWindowBasedEvaluation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicatorWindowBasedEvaluation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicatorWindowBasedEvaluation {
        private final java.lang.String op;
        private final java.lang.Object queries;
        private final java.lang.String queryType;
        private final java.lang.String size;
        private final java.lang.Number threshold;
        private final java.lang.String aggregation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.op = software.amazon.jsii.Kernel.get(this, "op", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.queries = software.amazon.jsii.Kernel.get(this, "queries", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.queryType = software.amazon.jsii.Kernel.get(this, "queryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.aggregation = software.amazon.jsii.Kernel.get(this, "aggregation", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.op = java.util.Objects.requireNonNull(builder.op, "op is required");
            this.queries = java.util.Objects.requireNonNull(builder.queries, "queries is required");
            this.queryType = java.util.Objects.requireNonNull(builder.queryType, "queryType is required");
            this.size = java.util.Objects.requireNonNull(builder.size, "size is required");
            this.threshold = java.util.Objects.requireNonNull(builder.threshold, "threshold is required");
            this.aggregation = builder.aggregation;
        }

        @Override
        public final java.lang.String getOp() {
            return this.op;
        }

        @Override
        public final java.lang.Object getQueries() {
            return this.queries;
        }

        @Override
        public final java.lang.String getQueryType() {
            return this.queryType;
        }

        @Override
        public final java.lang.String getSize() {
            return this.size;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.String getAggregation() {
            return this.aggregation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("op", om.valueToTree(this.getOp()));
            data.set("queries", om.valueToTree(this.getQueries()));
            data.set("queryType", om.valueToTree(this.getQueryType()));
            data.set("size", om.valueToTree(this.getSize()));
            data.set("threshold", om.valueToTree(this.getThreshold()));
            if (this.getAggregation() != null) {
                data.set("aggregation", om.valueToTree(this.getAggregation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicatorWindowBasedEvaluation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicatorWindowBasedEvaluation.Jsii$Proxy that = (SloIndicatorWindowBasedEvaluation.Jsii$Proxy) o;

            if (!op.equals(that.op)) return false;
            if (!queries.equals(that.queries)) return false;
            if (!queryType.equals(that.queryType)) return false;
            if (!size.equals(that.size)) return false;
            if (!threshold.equals(that.threshold)) return false;
            return this.aggregation != null ? this.aggregation.equals(that.aggregation) : that.aggregation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.op.hashCode();
            result = 31 * result + (this.queries.hashCode());
            result = 31 * result + (this.queryType.hashCode());
            result = 31 * result + (this.size.hashCode());
            result = 31 * result + (this.threshold.hashCode());
            result = 31 * result + (this.aggregation != null ? this.aggregation.hashCode() : 0);
            return result;
        }
    }
}
