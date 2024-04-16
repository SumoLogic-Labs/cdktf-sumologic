package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.211Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorRequestBasedEvaluationQueriesQueryGroup")
@software.amazon.jsii.Jsii.Proxy(SloIndicatorRequestBasedEvaluationQueriesQueryGroup.Jsii$Proxy.class)
public interface SloIndicatorRequestBasedEvaluationQueriesQueryGroup extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query Slo#query}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQuery();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#row_id Slo#row_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRowId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#use_row_count Slo#use_row_count}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getUseRowCount();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#field Slo#field}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicatorRequestBasedEvaluationQueriesQueryGroup> {
        java.lang.String query;
        java.lang.String rowId;
        java.lang.Object useRowCount;
        java.lang.String field;

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup#getQuery}
         * @param query Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query Slo#query}. This parameter is required.
         * @return {@code this}
         */
        public Builder query(java.lang.String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup#getRowId}
         * @param rowId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#row_id Slo#row_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder rowId(java.lang.String rowId) {
            this.rowId = rowId;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup#getUseRowCount}
         * @param useRowCount Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#use_row_count Slo#use_row_count}. This parameter is required.
         * @return {@code this}
         */
        public Builder useRowCount(java.lang.Boolean useRowCount) {
            this.useRowCount = useRowCount;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup#getUseRowCount}
         * @param useRowCount Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#use_row_count Slo#use_row_count}. This parameter is required.
         * @return {@code this}
         */
        public Builder useRowCount(com.hashicorp.cdktf.IResolvable useRowCount) {
            this.useRowCount = useRowCount;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup#getField}
         * @param field Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#field Slo#field}.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicatorRequestBasedEvaluationQueriesQueryGroup build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicatorRequestBasedEvaluationQueriesQueryGroup}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicatorRequestBasedEvaluationQueriesQueryGroup {
        private final java.lang.String query;
        private final java.lang.String rowId;
        private final java.lang.Object useRowCount;
        private final java.lang.String field;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.query = software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rowId = software.amazon.jsii.Kernel.get(this, "rowId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.useRowCount = software.amazon.jsii.Kernel.get(this, "useRowCount", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.query = java.util.Objects.requireNonNull(builder.query, "query is required");
            this.rowId = java.util.Objects.requireNonNull(builder.rowId, "rowId is required");
            this.useRowCount = java.util.Objects.requireNonNull(builder.useRowCount, "useRowCount is required");
            this.field = builder.field;
        }

        @Override
        public final java.lang.String getQuery() {
            return this.query;
        }

        @Override
        public final java.lang.String getRowId() {
            return this.rowId;
        }

        @Override
        public final java.lang.Object getUseRowCount() {
            return this.useRowCount;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("query", om.valueToTree(this.getQuery()));
            data.set("rowId", om.valueToTree(this.getRowId()));
            data.set("useRowCount", om.valueToTree(this.getUseRowCount()));
            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicatorRequestBasedEvaluationQueriesQueryGroup"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicatorRequestBasedEvaluationQueriesQueryGroup.Jsii$Proxy that = (SloIndicatorRequestBasedEvaluationQueriesQueryGroup.Jsii$Proxy) o;

            if (!query.equals(that.query)) return false;
            if (!rowId.equals(that.rowId)) return false;
            if (!useRowCount.equals(that.useRowCount)) return false;
            return this.field != null ? this.field.equals(that.field) : that.field == null;
        }

        @Override
        public final int hashCode() {
            int result = this.query.hashCode();
            result = 31 * result + (this.rowId.hashCode());
            result = 31 * result + (this.useRowCount.hashCode());
            result = 31 * result + (this.field != null ? this.field.hashCode() : 0);
            return result;
        }
    }
}
