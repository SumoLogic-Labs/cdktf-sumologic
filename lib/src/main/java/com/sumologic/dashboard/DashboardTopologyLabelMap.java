package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.877Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardTopologyLabelMap")
@software.amazon.jsii.Jsii.Proxy(DashboardTopologyLabelMap.Jsii$Proxy.class)
public interface DashboardTopologyLabelMap extends software.amazon.jsii.JsiiSerializable {

    /**
     * data block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#data Dashboard#data}
     */
    @org.jetbrains.annotations.NotNull java.lang.Object getData();

    /**
     * @return a {@link Builder} of {@link DashboardTopologyLabelMap}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardTopologyLabelMap}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardTopologyLabelMap> {
        java.lang.Object data;

        /**
         * Sets the value of {@link DashboardTopologyLabelMap#getData}
         * @param data data block. This parameter is required.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#data Dashboard#data}
         * @return {@code this}
         */
        public Builder data(com.hashicorp.cdktf.IResolvable data) {
            this.data = data;
            return this;
        }

        /**
         * Sets the value of {@link DashboardTopologyLabelMap#getData}
         * @param data data block. This parameter is required.
         *             Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#data Dashboard#data}
         * @return {@code this}
         */
        public Builder data(java.util.List<? extends com.sumologic.dashboard.DashboardTopologyLabelMapData> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardTopologyLabelMap}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardTopologyLabelMap build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardTopologyLabelMap}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardTopologyLabelMap {
        private final java.lang.Object data;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.data = software.amazon.jsii.Kernel.get(this, "data", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.data = java.util.Objects.requireNonNull(builder.data, "data is required");
        }

        @Override
        public final java.lang.Object getData() {
            return this.data;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("data", om.valueToTree(this.getData()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardTopologyLabelMap"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardTopologyLabelMap.Jsii$Proxy that = (DashboardTopologyLabelMap.Jsii$Proxy) o;

            return this.data.equals(that.data);
        }

        @Override
        public final int hashCode() {
            int result = this.data.hashCode();
            return result;
        }
    }
}
