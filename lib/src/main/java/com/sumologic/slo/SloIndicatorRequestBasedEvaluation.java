package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.210Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorRequestBasedEvaluation")
@software.amazon.jsii.Jsii.Proxy(SloIndicatorRequestBasedEvaluation.Jsii$Proxy.class)
public interface SloIndicatorRequestBasedEvaluation extends software.amazon.jsii.JsiiSerializable {

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
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#op Slo#op}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOp() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#threshold Slo#threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloIndicatorRequestBasedEvaluation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicatorRequestBasedEvaluation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicatorRequestBasedEvaluation> {
        java.lang.Object queries;
        java.lang.String queryType;
        java.lang.String op;
        java.lang.Number threshold;

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluation#getQueries}
         * @param queries queries block. This parameter is required.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#queries Slo#queries}
         * @return {@code this}
         */
        public Builder queries(com.hashicorp.cdktf.IResolvable queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluation#getQueries}
         * @param queries queries block. This parameter is required.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#queries Slo#queries}
         * @return {@code this}
         */
        public Builder queries(java.util.List<? extends com.sumologic.slo.SloIndicatorRequestBasedEvaluationQueries> queries) {
            this.queries = queries;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluation#getQueryType}
         * @param queryType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_type Slo#query_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryType(java.lang.String queryType) {
            this.queryType = queryType;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluation#getOp}
         * @param op Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#op Slo#op}.
         * @return {@code this}
         */
        public Builder op(java.lang.String op) {
            this.op = op;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluation#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#threshold Slo#threshold}.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicatorRequestBasedEvaluation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicatorRequestBasedEvaluation build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicatorRequestBasedEvaluation}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicatorRequestBasedEvaluation {
        private final java.lang.Object queries;
        private final java.lang.String queryType;
        private final java.lang.String op;
        private final java.lang.Number threshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.queries = software.amazon.jsii.Kernel.get(this, "queries", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.queryType = software.amazon.jsii.Kernel.get(this, "queryType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.op = software.amazon.jsii.Kernel.get(this, "op", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.queries = java.util.Objects.requireNonNull(builder.queries, "queries is required");
            this.queryType = java.util.Objects.requireNonNull(builder.queryType, "queryType is required");
            this.op = builder.op;
            this.threshold = builder.threshold;
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
        public final java.lang.String getOp() {
            return this.op;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("queries", om.valueToTree(this.getQueries()));
            data.set("queryType", om.valueToTree(this.getQueryType()));
            if (this.getOp() != null) {
                data.set("op", om.valueToTree(this.getOp()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicatorRequestBasedEvaluation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicatorRequestBasedEvaluation.Jsii$Proxy that = (SloIndicatorRequestBasedEvaluation.Jsii$Proxy) o;

            if (!queries.equals(that.queries)) return false;
            if (!queryType.equals(that.queryType)) return false;
            if (this.op != null ? !this.op.equals(that.op) : that.op != null) return false;
            return this.threshold != null ? this.threshold.equals(that.threshold) : that.threshold == null;
        }

        @Override
        public final int hashCode() {
            int result = this.queries.hashCode();
            result = 31 * result + (this.queryType.hashCode());
            result = 31 * result + (this.op != null ? this.op.hashCode() : 0);
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            return result;
        }
    }
}
