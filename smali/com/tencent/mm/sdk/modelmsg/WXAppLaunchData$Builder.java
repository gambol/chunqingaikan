package com.tencent.mm.sdk.modelmsg; class WXAppLaunchData$Builder { void a() { int a;
a=0;// .class public Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData$Builder;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static fromBundle(Landroid/os/Bundle;)Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;);
a=0;//     invoke-direct {v0}, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;);
a=0;//     const-string v1, "_wxapplaunchdata_launchType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;->launchType:I
a=0;// 
a=0;//     const-string v1, "_wxapplaunchdata_message"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;->message:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static toBundle(Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;)Landroid/os/Bundle;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "_wxapplaunchdata_launchType"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;->launchType:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     const-string v1, "_wxapplaunchdata_message"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/mm/sdk/modelmsg/WXAppLaunchData;->message:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
