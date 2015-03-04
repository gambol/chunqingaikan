package net.slidingmenu.tools.br; class slidingaxxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/br/slidingaxxc;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final PROTOCOLVERSION:Ljava/lang/String; = "4"
a=0;// 
a=0;// .field protected static a:Ljava/util/HashMap;
a=0;// 
a=0;// .field private static b:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lnet/slidingmenu/tools/br/slidingaxxc;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/br/slidingaxxc;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static a()I
a=0;//     .locals 1
a=0;// 
a=0;//     sget v0, Lnet/slidingmenu/tools/br/slidingaxxc;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     sput p0, Lnet/slidingmenu/tools/br/slidingaxxc;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static sliacsd(Landroid/content/Context;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/a/g/b/a;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static sliaesds(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const-string v0, "Lack of android.permission.INTERNET permission!"
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v0, "Lack of android.permission.WRITE_EXTERNAL_STORAGE permission!"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->d(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const-string v0, "Lack of android.permission.ACCESS_NETWORK_STATE permission!"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-static {p0}, Lnet/slidingmenu/tools/b/b/k/k;->g(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v0, "Lack of android.permission.ACCESS_WIFI_STATE permission!"
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static sliassd(I)Lnet/slidingmenu/tools/br/h;
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/br/h;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static slicnsd(ILnet/slidingmenu/tools/br/h;)V
a=0;//     .locals 2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/br/slidingaxxc;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
