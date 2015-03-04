package com.tencent.tauth; class LocationApi$3 { void a() { int a;
a=0;// .class Lcom/tencent/tauth/LocationApi$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/tencent/tauth/LocationApi;->report(Ljava/lang/String;[Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;// .field final synthetic val$action:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic val$args:[Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/tauth/LocationApi;[Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 238
a=0;//     iput-object p1, p0, Lcom/tencent/tauth/LocationApi$3;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/tauth/LocationApi$3;->val$args:[Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/tauth/LocationApi$3;->val$action:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/tauth/LocationApi$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$3;->val$args:[Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/tauth/LocationApi$3;->val$args:[Ljava/lang/String;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 244
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "search_nearby"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi$3;->val$action:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const-string v0, "id_search_nearby"
a=0;// 
a=0;//     .line 245
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/tauth/LocationApi$3;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/tauth/LocationApi;->access$400(Lcom/tencent/tauth/LocationApi;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/tauth/LocationApi$3;->this$0:Lcom/tencent/tauth/LocationApi;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/tauth/LocationApi;);
a=0;//     invoke-static {v2}, Lcom/tencent/tauth/LocationApi;->access$500(Lcom/tencent/tauth/LocationApi;)Lcom/tencent/connect/auth/QQToken;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/tauth/LocationApi$3;->val$args:[Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0, v3}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "id_delete_location"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
