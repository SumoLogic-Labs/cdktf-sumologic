package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.117Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorQueries")
@software.amazon.jsii.Jsii.Proxy(MonitorQueries.Jsii$Proxy.class)
public interface MonitorQueries extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#query Monitor#query}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQuery();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#row_id Monitor#row_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRowId();

    /**
     * @return a {@link Builder} of {@link MonitorQueries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorQueries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorQueries> {
        java.lang.String query;
        java.lang.String rowId;

        /**
         * Sets the value of {@link MonitorQueries#getQuery}
         * @param query Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#query Monitor#query}. This parameter is required.
         * @return {@code this}
         */
        public Builder query(java.lang.String query) {
            this.query = query;
            return this;
        }

        /**
         * Sets the value of {@link MonitorQueries#getRowId}
         * @param rowId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#row_id Monitor#row_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder rowId(java.lang.String rowId) {
            this.rowId = rowId;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorQueries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorQueries build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorQueries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorQueries {
        private final java.lang.String query;
        private final java.lang.String rowId;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.query = software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.rowId = software.amazon.jsii.Kernel.get(this, "rowId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.query = java.util.Objects.requireNonNull(builder.query, "query is required");
            this.rowId = java.util.Objects.requireNonNull(builder.rowId, "rowId is required");
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
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("query", om.valueToTree(this.getQuery()));
            data.set("rowId", om.valueToTree(this.getRowId()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorQueries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorQueries.Jsii$Proxy that = (MonitorQueries.Jsii$Proxy) o;

            if (!query.equals(that.query)) return false;
            return this.rowId.equals(that.rowId);
        }

        @Override
        public final int hashCode() {
            int result = this.query.hashCode();
            result = 31 * result + (this.rowId.hashCode());
            return result;
        }
    }
}
