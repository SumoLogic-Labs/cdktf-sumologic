package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.213Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorWindowBasedEvaluationQueries")
@software.amazon.jsii.Jsii.Proxy(SloIndicatorWindowBasedEvaluationQueries.Jsii$Proxy.class)
public interface SloIndicatorWindowBasedEvaluationQueries extends software.amazon.jsii.JsiiSerializable {

    /**
     * query_group block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_group Slo#query_group}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getQueryGroup();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_group_type Slo#query_group_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQueryGroupType();

    /**
     * @return a {@link Builder} of {@link SloIndicatorWindowBasedEvaluationQueries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicatorWindowBasedEvaluationQueries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicatorWindowBasedEvaluationQueries> {
        java.lang.Object queryGroup;
        java.lang.String queryGroupType;

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluationQueries#getQueryGroup}
         * @param queryGroup query_group block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_group Slo#query_group}
         * @return {@code this}
         */
        public Builder queryGroup(com.hashicorp.cdktf.IResolvable queryGroup) {
            this.queryGroup = queryGroup;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluationQueries#getQueryGroup}
         * @param queryGroup query_group block. This parameter is required.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_group Slo#query_group}
         * @return {@code this}
         */
        public Builder queryGroup(java.util.List<? extends com.sumologic.slo.SloIndicatorWindowBasedEvaluationQueriesQueryGroup> queryGroup) {
            this.queryGroup = queryGroup;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorWindowBasedEvaluationQueries#getQueryGroupType}
         * @param queryGroupType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#query_group_type Slo#query_group_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder queryGroupType(java.lang.String queryGroupType) {
            this.queryGroupType = queryGroupType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicatorWindowBasedEvaluationQueries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicatorWindowBasedEvaluationQueries build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicatorWindowBasedEvaluationQueries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicatorWindowBasedEvaluationQueries {
        private final java.lang.Object queryGroup;
        private final java.lang.String queryGroupType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.queryGroup = software.amazon.jsii.Kernel.get(this, "queryGroup", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.queryGroupType = software.amazon.jsii.Kernel.get(this, "queryGroupType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.queryGroup = java.util.Objects.requireNonNull(builder.queryGroup, "queryGroup is required");
            this.queryGroupType = java.util.Objects.requireNonNull(builder.queryGroupType, "queryGroupType is required");
        }

        @Override
        public final java.lang.Object getQueryGroup() {
            return this.queryGroup;
        }

        @Override
        public final java.lang.String getQueryGroupType() {
            return this.queryGroupType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("queryGroup", om.valueToTree(this.getQueryGroup()));
            data.set("queryGroupType", om.valueToTree(this.getQueryGroupType()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicatorWindowBasedEvaluationQueries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicatorWindowBasedEvaluationQueries.Jsii$Proxy that = (SloIndicatorWindowBasedEvaluationQueries.Jsii$Proxy) o;

            if (!queryGroup.equals(that.queryGroup)) return false;
            return this.queryGroupType.equals(that.queryGroupType);
        }

        @Override
        public final int hashCode() {
            int result = this.queryGroup.hashCode();
            result = 31 * result + (this.queryGroupType.hashCode());
            return result;
        }
    }
}
