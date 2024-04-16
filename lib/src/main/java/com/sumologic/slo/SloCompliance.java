package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.207Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloCompliance")
@software.amazon.jsii.Jsii.Proxy(SloCompliance.Jsii$Proxy.class)
public interface SloCompliance extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#compliance_type Slo#compliance_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getComplianceType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#size Slo#size}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getSize();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#target Slo#target}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getTarget();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#timezone Slo#timezone}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getTimezone();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#start_from Slo#start_from}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getStartFrom() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloCompliance}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloCompliance}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloCompliance> {
        java.lang.String complianceType;
        java.lang.String size;
        java.lang.Number target;
        java.lang.String timezone;
        java.lang.String startFrom;

        /**
         * Sets the value of {@link SloCompliance#getComplianceType}
         * @param complianceType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#compliance_type Slo#compliance_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder complianceType(java.lang.String complianceType) {
            this.complianceType = complianceType;
            return this;
        }

        /**
         * Sets the value of {@link SloCompliance#getSize}
         * @param size Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#size Slo#size}. This parameter is required.
         * @return {@code this}
         */
        public Builder size(java.lang.String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets the value of {@link SloCompliance#getTarget}
         * @param target Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#target Slo#target}. This parameter is required.
         * @return {@code this}
         */
        public Builder target(java.lang.Number target) {
            this.target = target;
            return this;
        }

        /**
         * Sets the value of {@link SloCompliance#getTimezone}
         * @param timezone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#timezone Slo#timezone}. This parameter is required.
         * @return {@code this}
         */
        public Builder timezone(java.lang.String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Sets the value of {@link SloCompliance#getStartFrom}
         * @param startFrom Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#start_from Slo#start_from}.
         * @return {@code this}
         */
        public Builder startFrom(java.lang.String startFrom) {
            this.startFrom = startFrom;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloCompliance}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloCompliance build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloCompliance}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloCompliance {
        private final java.lang.String complianceType;
        private final java.lang.String size;
        private final java.lang.Number target;
        private final java.lang.String timezone;
        private final java.lang.String startFrom;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.complianceType = software.amazon.jsii.Kernel.get(this, "complianceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.size = software.amazon.jsii.Kernel.get(this, "size", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.target = software.amazon.jsii.Kernel.get(this, "target", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timezone = software.amazon.jsii.Kernel.get(this, "timezone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.startFrom = software.amazon.jsii.Kernel.get(this, "startFrom", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.complianceType = java.util.Objects.requireNonNull(builder.complianceType, "complianceType is required");
            this.size = java.util.Objects.requireNonNull(builder.size, "size is required");
            this.target = java.util.Objects.requireNonNull(builder.target, "target is required");
            this.timezone = java.util.Objects.requireNonNull(builder.timezone, "timezone is required");
            this.startFrom = builder.startFrom;
        }

        @Override
        public final java.lang.String getComplianceType() {
            return this.complianceType;
        }

        @Override
        public final java.lang.String getSize() {
            return this.size;
        }

        @Override
        public final java.lang.Number getTarget() {
            return this.target;
        }

        @Override
        public final java.lang.String getTimezone() {
            return this.timezone;
        }

        @Override
        public final java.lang.String getStartFrom() {
            return this.startFrom;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("complianceType", om.valueToTree(this.getComplianceType()));
            data.set("size", om.valueToTree(this.getSize()));
            data.set("target", om.valueToTree(this.getTarget()));
            data.set("timezone", om.valueToTree(this.getTimezone()));
            if (this.getStartFrom() != null) {
                data.set("startFrom", om.valueToTree(this.getStartFrom()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloCompliance"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloCompliance.Jsii$Proxy that = (SloCompliance.Jsii$Proxy) o;

            if (!complianceType.equals(that.complianceType)) return false;
            if (!size.equals(that.size)) return false;
            if (!target.equals(that.target)) return false;
            if (!timezone.equals(that.timezone)) return false;
            return this.startFrom != null ? this.startFrom.equals(that.startFrom) : that.startFrom == null;
        }

        @Override
        public final int hashCode() {
            int result = this.complianceType.hashCode();
            result = 31 * result + (this.size.hashCode());
            result = 31 * result + (this.target.hashCode());
            result = 31 * result + (this.timezone.hashCode());
            result = 31 * result + (this.startFrom != null ? this.startFrom.hashCode() : 0);
            return result;
        }
    }
}
