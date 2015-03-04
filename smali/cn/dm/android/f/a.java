package cn.dm.android.f; class a { void a() { int a;
a=0;// .class public Lcn/dm/android/f/a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final A:Ljava/lang/String; = "is_root"
a=0;// 
a=0;// .field public static final B:Ljava/lang/String; = "memoryinfo"
a=0;// 
a=0;// .field public static final C:Ljava/lang/String; = "siminfo"
a=0;// 
a=0;// .field public static final D:Ljava/lang/String; = "cpuinfo"
a=0;// 
a=0;// .field private static E:Lcn/dm/android/f/e; = null
a=0;// 
a=0;// .field private static F:Ljava/util/ArrayList; = null
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static G:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static final H:Ljava/lang/String; = "sdk"
a=0;// 
a=0;// .field public static final a:Ljava/lang/String; = "idv"
a=0;// 
a=0;// .field public static final b:Ljava/lang/String; = "ov"
a=0;// 
a=0;// .field public static final c:Ljava/lang/String; = "hwmodal"
a=0;// 
a=0;// .field public static final d:Ljava/lang/String; = "carrier"
a=0;// 
a=0;// .field public static final e:Ljava/lang/String; = "so"
a=0;// 
a=0;// .field public static final f:Ljava/lang/String; = "sw"
a=0;// 
a=0;// .field public static final g:Ljava/lang/String; = "sh"
a=0;// 
a=0;// .field public static final h:Ljava/lang/String; = "sd"
a=0;// 
a=0;// .field public static final i:Ljava/lang/String; = "pkg_name"
a=0;// 
a=0;// .field public static final j:Ljava/lang/String; = "pkg_vn"
a=0;// 
a=0;// .field public static final k:Ljava/lang/String; = "pkg_vc"
a=0;// 
a=0;// .field public static final l:Ljava/lang/String; = "app_name"
a=0;// 
a=0;// .field public static final m:Ljava/lang/String; = "coord"
a=0;// 
a=0;// .field public static final n:Ljava/lang/String; = "coord_ts"
a=0;// 
a=0;// .field public static final o:Ljava/lang/String; = "coord_acc"
a=0;// 
a=0;// .field public static final p:Ljava/lang/String; = "coord_status"
a=0;// 
a=0;// .field public static final q:Ljava/lang/String; = "network"
a=0;// 
a=0;// .field public static final r:Ljava/lang/String; = "ma"
a=0;// 
a=0;// .field public static final s:Ljava/lang/String; = "ama"
a=0;// 
a=0;// .field public static final t:Ljava/lang/String; = "an"
a=0;// 
a=0;// .field public static final u:Ljava/lang/String; = "odin1"
a=0;// 
a=0;// .field protected static final v:Ljava/lang/String; = "isemulator"
a=0;// 
a=0;// .field protected static final w:Ljava/lang/String; = "imei"
a=0;// 
a=0;// .field protected static final x:Ljava/lang/String; = "imsi"
a=0;// 
a=0;// .field protected static final y:Ljava/lang/String; = "andoidid"
a=0;// 
a=0;// .field protected static final z:Ljava/lang/String; = "install"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/f/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 19
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     sput-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static A(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 214
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static B(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Start to generate device id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 265
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 267
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->g(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 268
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 273
a=0;//     :goto_0
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 275
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->h(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 276
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 277
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 282
a=0;//     :goto_1
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 290
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->i(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 291
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 297
a=0;//     :goto_3
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Generated device id: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 284
a=0;//     sget-object v2, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     const-string v2, "you must set READ_PHONE_STATE permisson in AndroidManifest.xml"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 279
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v2=(Uninit);
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 286
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 287
a=0;//     sget-object v2, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/e;);
a=0;//     invoke-virtual {v2, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 294
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     const-string v2, "Android ID is null, use -1 instead"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lcn/dm/android/f/e;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 295
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "pkg_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 112
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     invoke-static {p1, p2}, Lcn/dm/android/f/h;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 672
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/b/b;);
a=0;//     const-string v1, "imei_storage"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2}, Lcn/dm/android/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 674
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Ljava/util/ArrayList;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u9700\u8981\u5173\u95ed\u7684\u5b57\u6bb5: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     sput-object p0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 96
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "install"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 535
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 537
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {p0, p1}, Lcn/dm/android/f/c;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "pkg_vc"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "coord_ts"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 414
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 416
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->e()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 618
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "deviceId is null!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 658
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 623
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {p0}, Lcn/dm/a/d/b;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".system"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "system.bat"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 626
a=0;//     invoke-static {v0}, Lcn/dm/a/d/b;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 628
a=0;//     invoke-static {v0}, Lcn/dm/a/d/b;->e(Ljava/lang/String;)Z
a=0;// 
a=0;//     .line 629
a=0;//     invoke-static {p0, v0, p1}, Lcn/dm/android/f/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 634
a=0;//     :cond_1
a=0;//     invoke-static {v0}, Lcn/dm/android/f/h;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 638
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 641
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "imei_storage"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/dm/android/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 645
a=0;//     :cond_2
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 648
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "imei_storage"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/dm/android/b/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 652
a=0;//     :cond_3
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "|"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 653
a=0;//     invoke-static {p0, v0, v1}, Lcn/dm/android/f/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 425
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "coord_acc"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 426
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 428
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "pkg_vn"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 139
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->c(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "coord_status"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 438
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 440
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->d()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "app_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 155
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static e(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "idv"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 181
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcn/dm/android/f/a;->G:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 172
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->f(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 173
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Use emulator id"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     const-string v0, "-1,-1,emulator"
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/a;->G:Ljava/lang/String;
a=0;// 
a=0;//     .line 181
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     sget-object v0, Lcn/dm/android/f/a;->G:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     sget-object v0, Lcn/dm/android/f/a;->E:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Generate device id"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 177
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->B(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/a;->G:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static e()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "is_root"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 561
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 563
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->h()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static f(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 191
a=0;//     #v0=(Null);
a=0;//     sget-object v1, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v2, "isemulator"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 196
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->i(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->A(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "sdk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static g(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "imei"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 227
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->l(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static h(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "imsi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->m(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static i(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "andoidid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 253
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->n(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static j(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "ov"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 311
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->o(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static k(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "hwmodal"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 324
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->p(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static l(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "carrier"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     .line 337
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->s(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static m(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "so"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 350
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->t(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static n(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "sw"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 361
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 363
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->y(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static o(Landroid/content/Context;)I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "sh"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 376
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->z(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static p(Landroid/content/Context;)F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 386
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "sd"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 387
a=0;//     const/high16 v0, -0x40800000    # -1.0f
a=0;// 
a=0;//     .line 389
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->v(Landroid/content/Context;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static q(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "coord"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 402
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->B(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static r(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "network"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 452
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 454
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->q(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static s(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "ma"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 467
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->f(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static t(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "ama"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 478
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 488
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 480
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->C(Landroid/content/Context;)Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 481
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 482
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 483
a=0;//     iget-object v0, v1, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;
a=0;// 
a=0;//     .line 485
a=0;//     :cond_2
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 488
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static u(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "an"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 499
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 509
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 501
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->C(Landroid/content/Context;)Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 502
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 503
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 504
a=0;//     iget-object v0, v1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;
a=0;// 
a=0;//     .line 506
a=0;//     :cond_2
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 509
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static v(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 519
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "odin1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 520
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 522
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/android/f/g;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static w(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "siminfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 548
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 550
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->E(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static x(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "cpuinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 577
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->f()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static y(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 588
a=0;//     #v7=(Null);
a=0;//     sget-object v0, Lcn/dm/android/f/a;->F:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v1, "memoryinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 596
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 591
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-static {}, Lcn/dm/android/f/c;->g()[J
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 592
a=0;//     #v0=(Reference,[J);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->D(Landroid/content/Context;)[J
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 594
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-wide v3, v1, v7
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ","
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     aget-wide v3, v1, v7
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     aget-wide v5, v1, v8
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     sub-long/2addr v3, v5
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ","
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-wide v2, v0, v7
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     aget-wide v2, v0, v7
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     aget-wide v4, v0, v8
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static z(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->e(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 608
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/Thread;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v2, Lcn/dm/android/f/a$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/f/a$1;);
a=0;//     invoke-direct {v2, p0, v0}, Lcn/dm/android/f/a$1;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/a$1;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 614
a=0;//     return-void
a=0;// .end method
}}
