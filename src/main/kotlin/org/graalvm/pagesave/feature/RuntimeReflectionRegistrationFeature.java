package org.graalvm.pagesave.feature;

import lombok.SneakyThrows;
import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;

class RuntimeReflectionRegistrationFeature implements Feature {

	@SneakyThrows
	public void beforeAnalysis(Feature.BeforeAnalysisAccess access) {
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasLaunchApp.class);
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasLaunchApp.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasPermissions.class);
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasPermissions.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasNetworkConditions.class);
		RuntimeReflection.register(org.openqa.selenium.chromium.AddHasNetworkConditions.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.chrome.AddHasCasting.class);
		RuntimeReflection.register(org.openqa.selenium.chrome.AddHasCasting.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.chrome.AddHasCdp.class);
		RuntimeReflection.register(org.openqa.selenium.chrome.AddHasCdp.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.edge.AddHasCasting.class);
		RuntimeReflection.register(org.openqa.selenium.edge.AddHasCasting.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.edge.AddHasCdp.class);
		RuntimeReflection.register(org.openqa.selenium.edge.AddHasCdp.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasContext.class);
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasContext.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasExtensions.class);
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasExtensions.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasFullPageScreenshot.class);
		RuntimeReflection.register(org.openqa.selenium.firefox.AddHasFullPageScreenshot.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.safari.AddHasPermissions.class);
		RuntimeReflection.register(org.openqa.selenium.safari.AddHasPermissions.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.safari.AddHasDebugger.class);
		RuntimeReflection.register(org.openqa.selenium.safari.AddHasDebugger.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.remote.http.netty.NettyClient.Factory.class);
		RuntimeReflection.register(org.openqa.selenium.remote.http.netty.NettyClient.Factory.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.devtools.v104.V104CdpInfo.class);
		RuntimeReflection.register(org.openqa.selenium.devtools.v104.V104CdpInfo.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.devtools.v105.V105CdpInfo.class);
		RuntimeReflection.register(org.openqa.selenium.devtools.v105.V105CdpInfo.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.devtools.v106.V106CdpInfo.class);
		RuntimeReflection.register(org.openqa.selenium.devtools.v106.V106CdpInfo.class.getDeclaredConstructor());
		RuntimeReflection.register(org.openqa.selenium.devtools.v85.V85CdpInfo.class);
		RuntimeReflection.register(org.openqa.selenium.devtools.v85.V85CdpInfo.class.getDeclaredConstructor());
	}
}