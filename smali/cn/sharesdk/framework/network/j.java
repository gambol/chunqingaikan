package cn.sharesdk.framework.network; class j { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/network/j;
a=0;// .super Lcn/sharesdk/framework/network/h;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static c:Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lcn/sharesdk/framework/network/j;->c:Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/framework/network/h;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a()Lcn/sharesdk/framework/network/j;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcn/sharesdk/framework/network/j;->c:Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/j;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/network/j;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/network/j;->c:Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/network/j;->c:Lcn/sharesdk/framework/network/j;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     if-gtz p2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {p1, p2}, Lcn/sharesdk/framework/ShareSDK;->logApiEvent(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v6, p5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Lcn/sharesdk/framework/network/e;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move v7, p6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual/range {v0 .. v7}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p6, p7}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-super/range {p0 .. p5}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move v6, p4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual/range {v0 .. v6}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p5, p6}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/d;Lcn/sharesdk/framework/network/RawNetworkCallback;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/d;",
a=0;//             "Lcn/sharesdk/framework/network/RawNetworkCallback;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p5, p6}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcn/sharesdk/framework/network/h;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/d;Lcn/sharesdk/framework/network/RawNetworkCallback;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p6, p7}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-super/range {p0 .. p5}, Lcn/sharesdk/framework/network/h;->b(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/j;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;Ljava/util/ArrayList;Lcn/sharesdk/framework/network/e;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcn/sharesdk/framework/network/e",
a=0;//             "<*>;>;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     invoke-direct {p0, p5, p6}, Lcn/sharesdk/framework/network/j;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lcn/sharesdk/framework/network/h;->b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
