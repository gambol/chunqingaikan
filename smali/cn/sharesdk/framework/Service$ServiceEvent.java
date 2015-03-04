package cn.sharesdk.framework; class Service$ServiceEvent { void a() { int a;
a=0;// .class public abstract Lcn/sharesdk/framework/Service$ServiceEvent;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcn/sharesdk/framework/Service;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x409
a=0;//     name = "ServiceEvent"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final PLATFORM:I
a=0;// 
a=0;// .field protected service:Lcn/sharesdk/framework/Service;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcn/sharesdk/framework/Service;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/Service$ServiceEvent;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Lcn/sharesdk/framework/Service$ServiceEvent;->PLATFORM:I
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/Service$ServiceEvent;->service:Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected filterShareContent(ILcn/sharesdk/framework/Platform$ShareParams;Ljava/util/HashMap;)Ljava/util/HashMap;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Lcn/sharesdk/framework/Platform$ShareParams;",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;)",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/ShareSDK;->platformIdToName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/ShareSDK;->getPlatform(Ljava/lang/String;)Lcn/sharesdk/framework/Platform;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2, p3}, Lcn/sharesdk/framework/Platform;->filterShareContent(Lcn/sharesdk/framework/Platform$ShareParams;Ljava/util/HashMap;)Lcn/sharesdk/framework/statistics/b/f$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "shareID"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v0, Lcn/sharesdk/framework/statistics/b/f$a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "shareContent"
a=0;// 
a=0;//     new-instance v3, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v3}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/statistics/b/f$a;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Lcn/sharesdk/framework/utils/d;->a(Ljava/lang/String;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v0, "filterShareContent ==>>%s"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method protected toMap()Ljava/util/HashMap;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/Service$ServiceEvent;->service:Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/Service;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/Service;->a(Lcn/sharesdk/framework/Service;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "deviceid"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->q()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "appkey"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/Service$ServiceEvent;->service:Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Service;->getAppKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "apppkg"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "appver"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->t()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "sdkver"
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/framework/Service$ServiceEvent;->service:Lcn/sharesdk/framework/Service;
a=0;// 
a=0;//     invoke-virtual {v3}, Lcn/sharesdk/framework/Service;->getServiceVersionInt()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "plat"
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "networktype"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     const-string v2, "deviceData"
a=0;// 
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/d;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/d;);
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/framework/Service$ServiceEvent;->toMap()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/utils/d;->a(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
