package safiap.framework; class SafFrameworkManager { void a() { int a;
a=0;// .class public Lsafiap/framework/SafFrameworkManager;
a=0;// .super Landroid/app/Service;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/SafFrameworkManager$1;,
a=0;//         Lsafiap/framework/SafFrameworkManager$f;,
a=0;//         Lsafiap/framework/SafFrameworkManager$c;,
a=0;//         Lsafiap/framework/SafFrameworkManager$a;,
a=0;//         Lsafiap/framework/SafFrameworkManager$e;,
a=0;//         Lsafiap/framework/SafFrameworkManager$d;,
a=0;//         Lsafiap/framework/SafFrameworkManager$b;,
a=0;//         Lsafiap/framework/SafFrameworkManager$g;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:I = 0x0
a=0;// 
a=0;// .field private static e:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static f:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static g:Ljava/lang/String; = "safiap.framework.ACTION_CHECK_UPDATE"
a=0;// 
a=0;// .field private static h:Ljava/lang/String; = "safiap.framework.ACTION_FOREGROUND"
a=0;// 
a=0;// .field private static i:Ljava/lang/String; = "safiap.framework.KEY_FOREGROUND"
a=0;// 
a=0;// .field private static j:Z = false
a=0;// 
a=0;// .field private static k:Ljava/text/SimpleDateFormat; = null
a=0;// 
a=0;// .field private static l:I = 0x0
a=0;// 
a=0;// .field private static m:I = 0x0
a=0;// 
a=0;// .field private static n:I = 0x0
a=0;// 
a=0;// .field private static o:I = 0xc8
a=0;// 
a=0;// .field private static p:I = 0xc9
a=0;// 
a=0;// .field private static q:Z = false
a=0;// 
a=0;// .field private static r:Z = true
a=0;// 
a=0;// .field private static final s:I = 0x2
a=0;// 
a=0;// .field private static final t:I = 0x3
a=0;// 
a=0;// .field private static final u:I = 0x4
a=0;// 
a=0;// .field private static final v:I = 0x5
a=0;// 
a=0;// .field private static final w:Ljava/lang/String; = "action_name"
a=0;// 
a=0;// .field private static final x:Ljava/lang/String; = "file_name"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private A:Lsafiap/framework/b$a;
a=0;// 
a=0;// .field private B:Landroid/os/Handler;
a=0;// 
a=0;// .field private final C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;// .field private D:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;// .field private E:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lsafiap/framework/SafFrameworkManager$f;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field b:Lsafiap/framework/b;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:Lsafiap/framework/a/c;
a=0;// 
a=0;// .field private y:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lsafiap/framework/SafFrameworkManager$c;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private z:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v2=(Null);
a=0;//     const-string v0, "SafFrameworkManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     .line 62
a=0;//     const-string v0, "SafFrameworkManager"
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 70
a=0;//     sput-boolean v2, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "yyyyMMddHHmmss"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     sput-object v0, Lsafiap/framework/SafFrameworkManager;->k:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     .line 76
a=0;//     const/16 v0, 0x3e9
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lsafiap/framework/SafFrameworkManager;->l:I
a=0;// 
a=0;//     .line 77
a=0;//     const/16 v0, 0x3eb
a=0;// 
a=0;//     sput v0, Lsafiap/framework/SafFrameworkManager;->m:I
a=0;// 
a=0;//     .line 78
a=0;//     const/16 v0, 0x3f0
a=0;// 
a=0;//     sput v0, Lsafiap/framework/SafFrameworkManager;->n:I
a=0;// 
a=0;//     .line 79
a=0;//     const/16 v0, 0x3f1
a=0;// 
a=0;//     sput v0, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     .line 85
a=0;//     sput-boolean v2, Lsafiap/framework/SafFrameworkManager;->q:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 58
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 59
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 98
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Lsafiap/framework/b$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/b$a;);
a=0;//     invoke-direct {v0, p0, v1}, Lsafiap/framework/b$a;-><init>(Lsafiap/framework/SafFrameworkManager;B)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/b$a;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->A:Lsafiap/framework/b$a;
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Lsafiap/framework/SafFrameworkManager$g;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/SafFrameworkManager$g;);
a=0;//     invoke-direct {v0, p0, v1}, Lsafiap/framework/SafFrameworkManager$g;-><init>(Lsafiap/framework/SafFrameworkManager;B)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$g;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->B:Landroid/os/Handler;
a=0;// 
a=0;//     .line 952
a=0;//     new-instance v0, Lsafiap/framework/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/d;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/d;-><init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/d;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     .line 1281
a=0;//     new-instance v0, Lsafiap/framework/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/f;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/f;-><init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/f;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->D:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     .line 1603
a=0;//     new-instance v0, Lsafiap/framework/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/b;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/b;-><init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/b;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->b:Lsafiap/framework/b;
a=0;// 
a=0;//     .line 1636
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->E:Ljava/util/Map;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;I)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0xc9
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v0, 0xc8
a=0;// 
a=0;//     .line 1316
a=0;//     #v0=(PosShort);
a=0;//     if-gtz p2, :cond_2
a=0;// 
a=0;//     .line 1317
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, p1, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1326
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1320
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1323
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {p0, p1, v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1326
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/SafFrameworkManager;->c(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;)Ljava/util/Map;
a=0;//     .locals 15
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1337
a=0;//     new-instance v12, Ljava/util/HashMap;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v12}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 1338
a=0;//     #v12=(Reference,Ljava/util/HashMap;);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "getAllPluginInfoMap -------------- "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1341
a=0;//     invoke-static {p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1342
a=0;//     invoke-virtual {v0}, Lsafiap/framework/a/c;->a()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 1344
a=0;//     #v13=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v13, :cond_1
a=0;// 
a=0;//     invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1346
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v14=(Conflicted);
a=0;//     const-string v1, "action_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v13, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1347
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "package_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v13, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v13, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1348
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "version"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v13, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v13, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1349
a=0;//     const-string v4, "version_latest"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v13, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v13, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1350
a=0;//     const-string v5, "isdownloading"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v13, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v13, v5}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1352
a=0;//     new-instance v14, Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v14=(UninitRef,Lsafiap/framework/a/b;);
a=0;//     invoke-direct {v14}, Lsafiap/framework/a/b;-><init>()V
a=0;// 
a=0;//     .line 1353
a=0;//     #v14=(Reference,Lsafiap/framework/a/b;);
a=0;//     iput-object v2, v14, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 1354
a=0;//     iput-object v1, v14, Lsafiap/framework/a/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 1355
a=0;//     iput v3, v14, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     .line 1356
a=0;//     iput v4, v14, Lsafiap/framework/a/b;->e:I
a=0;// 
a=0;//     .line 1357
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v5, v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, v14, Lsafiap/framework/a/b;->j:Z
a=0;// 
a=0;//     .line 1360
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v2, v1}, Lsafiap/framework/SafFrameworkManager;->a(Landroid/content/Context;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1361
a=0;//     sget-object v3, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "getAllPluginInfoMap().actionName:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ".result:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1363
a=0;//     const/16 v3, 0xc9
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v3, v1, :cond_4
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 1365
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/a/c;->h(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 1379
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1382
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v14=(Conflicted);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     invoke-interface {v13}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1383
a=0;//     invoke-interface {v13}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 1385
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-object v12
a=0;// 
a=0;//     .line 1357
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);v1=(One);v2=(Reference,Ljava/lang/String;);v3=(Integer);v4=(Integer);v5=(Integer);v14=(Reference,Lsafiap/framework/a/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1369
a=0;//     :cond_4
a=0;//     #v1=(Integer);v3=(PosShort);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, v14, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1370
a=0;//     #v4=(Integer);
a=0;//     iput v4, v14, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     .line 1371
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getAllPluginInfoMap().installedVersion:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1374
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iget-object v2, v14, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v3, v14, Lsafiap/framework/a/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-virtual/range {v0 .. v11}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
a=0;// 
a=0;//     .line 1377
a=0;//     iget-object v1, v14, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v12, v1, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/a/c;)Lsafiap/framework/a/c;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iput-object p1, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Lsafiap/framework/util/MyLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;I)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 1502
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setdownloadNotification download type: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v2, 0x7532
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1503
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 1505
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 1506
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p0, v2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1508
a=0;//     sget-object v2, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v3, "set download notification........"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1510
a=0;//     const-string v2, "\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u4e0b\u8f7d\u4e2d..."
a=0;// 
a=0;//     .line 1511
a=0;//     new-instance v3, Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification;);
a=0;//     const v4, 0x1080081
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-direct {v3, v4, v2, v5, v6}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 1512
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     const-string v4, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, p0, v4, v2, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 1513
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 1514
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 1515
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/high16 v7, 0x10000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const v4, 0x108000a
a=0;// 
a=0;//     .line 1439
a=0;//     #v4=(Integer);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setIntallNotification().actionNames\'s key are: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", values are: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1440
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mForeground: "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-boolean v2, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1442
a=0;//     invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1491
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1454
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v2=(Boolean);v3=(Null);v5=(Uninit);v6=(Uninit);v7=(Integer);
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0, v3}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1456
a=0;//     #v1=(Boolean);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v0, Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1457
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v2, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1459
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1460
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->ACTION_TO_INSTALL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1461
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 1462
a=0;//     sget-object v5, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     .line 1467
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "actionName"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1470
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1471
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "sendIntallNotification ... fileName:"
a=0;// 
a=0;//     invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1472
a=0;//     const-string v1, "iapFileName"
a=0;// 
a=0;//     invoke-virtual {v2, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1473
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-direct {v1, v4, p2, v5, v6}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 1474
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0, v2, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1475
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     const-string v2, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     invoke-virtual {v1, p0, v2, p2, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 1476
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 1477
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 1480
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 1481
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->m:I
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 1483
a=0;//     sget-boolean v2, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 1484
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->m:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1487
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Reference,Landroid/content/Intent;);v3=(Null);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->m:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const-string v5, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     const-string v6, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     const-string v7, "\u66f4\u65b0\u4e0b\u8f7d\u5b8c\u6bd5\uff0c\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u5f53\u524d\u6b63\u5728\u8fd0\u884c\u4e2d\uff0c\u5c06\u5728\u4e0b\u4e00\u6b21\u542f\u52a8\u65f6\u5b89\u88c5\u3002"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;IILandroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateDBDownloadinfo().action Name:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ",filePath:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ",version:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 614
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;I)J
a=0;// 
a=0;//     .line 618
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/List;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/sdk/ISAFFrameworkCallback;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "I)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 599
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 601
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     .line 602
a=0;//     invoke-interface {v0, p1, p2}, Lsafiap/framework/sdk/ISAFFrameworkCallback;->onFinishDownload(Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 604
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 605
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:520003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 606
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     .line 609
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/List;Ljava/lang/String;II)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/sdk/ISAFFrameworkCallback;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             "II)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 584
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     .line 585
a=0;//     invoke-interface {v0, p1, p2, p3}, Lsafiap/framework/sdk/ISAFFrameworkCallback;->onDownloadProgress(Ljava/lang/String;II)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 587
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 588
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:520002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 589
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     .line 592
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "updateDBDownloadinfo().action Name:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ",filePath:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ",version:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;I)J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     invoke-interface {v0, p2, p3}, Lsafiap/framework/sdk/ISAFFrameworkCallback;->onFinishDownload(Ljava/lang/String;I)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:520003"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;II)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     invoke-interface {v0, p2, p3, p4}, Lsafiap/framework/sdk/ISAFFrameworkCallback;->onDownloadProgress(Ljava/lang/String;II)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:520002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;IZZ)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     #v2=(One);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "startDownload ... name:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ",and change isDownloadStatus..., isDownloading:"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "isDownloading mTaskPool.putAction..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     const/16 v1, 0x66
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, p0, p2, v1}, Lsafiap/framework/SafFrameworkManager$c;-><init>(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->c:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$a;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Boolean);
a=0;//     iget-object v6, p0, Lsafiap/framework/SafFrameworkManager;->B:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v0, Lsafiap/framework/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/c;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     invoke-direct/range {v0 .. v5}, Lsafiap/framework/c;-><init>(Lsafiap/framework/SafFrameworkManager;ZLjava/lang/String;Lsafiap/framework/sdk/ISAFFrameworkCallback;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/c;);
a=0;//     invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(One);v4=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "TaskPool is not null, and just add callback..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lsafiap/framework/SafFrameworkManager$c;->a(Lsafiap/framework/sdk/ISAFFrameworkCallback;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p2, v2}, Lsafiap/framework/sdk/b/d;->b(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     new-instance v1, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     const/16 v3, 0x65
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v1, p0, p2, v3}, Lsafiap/framework/SafFrameworkManager$c;-><init>(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "New task! mTaskPool.put(name, new PluginDownloader("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ")); ...mTaskPool"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ",mBinder: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ", package: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lsafiap/framework/SafFrameworkManager;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     move v2, v5
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;ZZ)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 632
a=0;//     #v2=(One);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "startDownload ... name:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ",and change isDownloadStatus..., isDownloading:"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 635
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 638
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 639
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "isDownloading mTaskPool.putAction..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 640
a=0;//     new-instance v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     const/16 v1, 0x66
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, p0, p2, v1}, Lsafiap/framework/SafFrameworkManager$c;-><init>(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 642
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->c:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$a;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 644
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 672
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     iget-object v6, p0, Lsafiap/framework/SafFrameworkManager;->B:Landroid/os/Handler;
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v0, Lsafiap/framework/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/c;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     move v5, p3
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lsafiap/framework/c;-><init>(Lsafiap/framework/SafFrameworkManager;ZLjava/lang/String;Lsafiap/framework/sdk/ISAFFrameworkCallback;Z)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/c;);
a=0;//     invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 731
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 647
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "TaskPool is not null, and just add callback..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 648
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 649
a=0;//     invoke-virtual {v0, p1}, Lsafiap/framework/SafFrameworkManager$c;->a(Lsafiap/framework/sdk/ISAFFrameworkCallback;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 654
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p2, v2}, Lsafiap/framework/sdk/b/d;->b(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     .line 655
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 656
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     new-instance v1, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     const/16 v3, 0x65
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v1, p0, p2, v3}, Lsafiap/framework/SafFrameworkManager$c;-><init>(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 660
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "New task! mTaskPool.put(name, new PluginDownloader("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ")); ...mTaskPool"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ",mBinder: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, ", package: "
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lsafiap/framework/SafFrameworkManager;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     move v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 734
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 735
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 737
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 738
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 739
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 740
a=0;//     iget-object v2, v0, Lsafiap/framework/SafFrameworkManager$c;->c:Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     .line 741
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager$e;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lsafiap/framework/SafFrameworkManager$e;->cancel(Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 742
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "query task for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " cancelled."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 754
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 745
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);v3=(Uninit);
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     .line 746
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 747
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/SafFrameworkManager$b;->cancel(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 748
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "download task for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " cancelled."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 750
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 754
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 862
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 863
a=0;//     invoke-static {p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 865
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lsafiap/framework/a/c;->h(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b(Landroid/content/Context;)Ljava/util/List;
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1394
a=0;//     #v1=(One);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1396
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1397
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/a/c;->a()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1399
a=0;//     #v3=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1401
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const-string v0, "cnname"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1402
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "package_name"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1403
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "action_name"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v5}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-interface {v3, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1404
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "version"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v6}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1405
a=0;//     const-string v7, "version_latest"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1406
a=0;//     const-string v8, "isdownloading"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v3, v8}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1408
a=0;//     new-instance v9, Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v9=(UninitRef,Lsafiap/framework/a/b;);
a=0;//     invoke-direct {v9}, Lsafiap/framework/a/b;-><init>()V
a=0;// 
a=0;//     .line 1410
a=0;//     #v9=(Reference,Lsafiap/framework/a/b;);
a=0;//     iput-object v0, v9, Lsafiap/framework/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 1411
a=0;//     iput-object v5, v9, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 1412
a=0;//     iput-object v4, v9, Lsafiap/framework/a/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 1413
a=0;//     iput v6, v9, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     .line 1414
a=0;//     iput v7, v9, Lsafiap/framework/a/b;->e:I
a=0;// 
a=0;//     .line 1415
a=0;//     if-ne v8, v1, :cond_5
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, v9, Lsafiap/framework/a/b;->j:Z
a=0;// 
a=0;//     .line 1418
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v5, v0}, Lsafiap/framework/SafFrameworkManager;->a(Landroid/content/Context;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1419
a=0;//     const/16 v4, 0xc9
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v4, v0, :cond_1
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1422
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1427
a=0;//     :cond_2
a=0;//     invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1430
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 1431
a=0;//     invoke-interface {v3}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 1434
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 1415
a=0;//     :cond_5
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Integer);v7=(Integer);v8=(Integer);v9=(Reference,Lsafiap/framework/a/b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b(Landroid/content/Context;I)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v6, 0x10000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v3, 0x7532
a=0;// 
a=0;//     .line 1523
a=0;//     #v3=(PosShort);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "setDisconnectNotification download type: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1525
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 1528
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->ACTION_NETWORK_ERROR:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1529
a=0;//     invoke-virtual {v0, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1530
a=0;//     const-string v1, "isMandatoryUpdate"
a=0;// 
a=0;//     sget-boolean v2, Lsafiap/framework/SafFrameworkManager;->q:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1531
a=0;//     const-string v1, "UpdateType"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 1533
a=0;//     const-string v1, "\u8bf7\u68c0\u67e5\u7f51\u7edc\u5e76\u70b9\u51fb\u91cd\u8bd5"
a=0;// 
a=0;//     .line 1534
a=0;//     new-instance v2, Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/app/Notification;);
a=0;//     const v3, 0x1080027
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v2, v3, v1, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 1535
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p0, v3, v0, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1536
a=0;//     const-string v3, "\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u4e0b\u8f7d\u51fa\u9519\u63d0\u793a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, p0, v3, v1, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 1537
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, v2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 1538
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 1540
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v3, "IAP is not complete downloading!"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1542
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 1544
a=0;//     sget-boolean v1, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1545
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->n:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 1548
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     #v1=(One);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v2, v0, Lsafiap/framework/SafFrameworkManager$c;->c:Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager$e;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lsafiap/framework/SafFrameworkManager$e;->cancel(Z)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "query task for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " cancelled."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);v3=(Uninit);
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/SafFrameworkManager$b;->cancel(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "download task for "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " cancelled."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Z)Z
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sput-boolean p0, Lsafiap/framework/SafFrameworkManager;->q:Z
a=0;// 
a=0;//     return p0
a=0;// .end method
a=0;// 
a=0;// .method private c(Ljava/lang/String;)I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x4e20
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1207
a=0;//     #v5=(Null);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "getPluginInfo.syncVersionInfo() @ Framework service ..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1211
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, p1, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1213
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1214
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lsafiap/framework/a/c;->h(Ljava/lang/String;)J
a=0;// 
a=0;//     .line 1217
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "check ("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")install failed ..."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1218
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 1241
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Byte);v6=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 1220
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 1221
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 1225
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1226
a=0;//     #v4=(Integer);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1227
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->k:Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1230
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p1, v8}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1231
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0, p1, v7}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1232
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v0 .. v6}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)J
a=0;// 
a=0;//     .line 1233
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1237
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v1, v8}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1238
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0, v2, v7}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1239
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v6}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)J
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static c(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1497
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 1498
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 1499
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/SafFrameworkManager;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     sget-boolean v0, Lsafiap/framework/SafFrameworkManager;->q:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private d(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1252
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "Start to check update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1253
a=0;//     new-instance v0, Lsafiap/framework/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/e;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p0, v1}, Lsafiap/framework/e;-><init>(Lsafiap/framework/SafFrameworkManager;Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 1270
a=0;//     #v0=(Reference,Lsafiap/framework/e;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1271
a=0;//     sget-object p1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     .line 1273
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/SafFrameworkManager;->c(Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1274
a=0;//     const/16 v1, 0x6f
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 1275
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 758
a=0;//     #v1=(One);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "cancelAllTask...start"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 759
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     .line 762
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 765
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 766
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 768
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 769
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 770
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 771
a=0;//     iget-object v3, v0, Lsafiap/framework/SafFrameworkManager$c;->c:Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     .line 772
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lsafiap/framework/SafFrameworkManager$e;->cancel(Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 773
a=0;//     sget-object v3, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v4, "query cancelled successfully!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 775
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, v0, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     .line 776
a=0;//     #v3=(Reference,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lsafiap/framework/SafFrameworkManager$b;->cancel(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 777
a=0;//     sget-object v4, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "download task: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lsafiap/framework/SafFrameworkManager$b;->a()Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v3, v3, Lsafiap/framework/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, " cancelled successfully!"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0, v1}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 783
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 786
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lsafiap/framework/SafFrameworkManager;)Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 56
a=0;//     #v1=(One);
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v2, "cancelAllTask...start"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->z:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     sget v2, Lsafiap/framework/SafFrameworkManager;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iget-object v3, v0, Lsafiap/framework/SafFrameworkManager$c;->c:Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lsafiap/framework/SafFrameworkManager$e;->cancel(Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     sget-object v3, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v4, "query cancelled successfully!"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, v0, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Lsafiap/framework/SafFrameworkManager$b;->cancel(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "download task: "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lsafiap/framework/SafFrameworkManager$b;->a()Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v3, v3, Lsafiap/framework/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v5, " cancelled successfully!"
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v3, v0, v1}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->A:Lsafiap/framework/b$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/b$a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/a/c;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lsafiap/framework/SafFrameworkManager;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->B:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic h(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->D:Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/UpdateManager$OnGotUpdateListListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic i(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->E:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 875
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "startInstallDialog().IAPPluginHasinstall:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 876
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     const-class v2, Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 877
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 879
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/a/c;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 880
a=0;//     invoke-static {p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 883
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 884
a=0;//     :try_start_0
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->ACTION_TO_INSTALL_IAP:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 885
a=0;//     const-string v1, "actionName"
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 886
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/a/c;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 887
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 888
a=0;//     const-string v2, "iapFileName"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 897
a=0;//     :cond_1
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/SafFrameworkManager;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 898
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/SafFrameworkManager;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 900
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->m:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 901
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 893
a=0;//     :catch_0
a=0;//     #v1=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 894
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(ZZ)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 910
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "starUpdateDialog().IAPPluginHasUpdate:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ",isMandatoryUpdate:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 911
a=0;//     const-string v0, "notification"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/SafFrameworkManager;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 912
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 913
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->b:Lsafiap/framework/b;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 914
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->b:Lsafiap/framework/b;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/b;);
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v3}, Lsafiap/framework/b;->a(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 918
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     const-class v4, Lsafiap/framework/ui/UpdateHintActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v3, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 919
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 920
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->ACTION_TO_UPDATE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 923
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 926
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/a/c;->e(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 927
a=0;//     sget-object v4, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "iapUpdateType is:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 928
a=0;//     const-string v4, "apk"
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 929
a=0;//     const-string v2, "apk"
a=0;// 
a=0;//     .line 935
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     sget-object v4, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "startUpdateDialog().appUpdateType is:"
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 936
a=0;//     const-string v4, "appUpdateType"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 937
a=0;//     const-string v2, "isMandatoryUpdate"
a=0;// 
a=0;//     invoke-virtual {v3, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 938
a=0;//     const-string v2, "UpdateType"
a=0;// 
a=0;//     const/16 v4, 0x7532
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 939
a=0;//     const-string v2, "iapIsDownloading"
a=0;// 
a=0;//     invoke-virtual {v3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 940
a=0;//     const-string v1, "iapApkSize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/a/c;->c(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 941
a=0;//     const-string v1, "iapApkVersion"
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     sget-object v4, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/a/c;->d(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 943
a=0;//     sget v1, Lsafiap/framework/SafFrameworkManager;->n:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 945
a=0;//     invoke-virtual {p0, v3}, Lsafiap/framework/SafFrameworkManager;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 948
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 930
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Reference,Ljava/lang/String;);v4=(Boolean);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "patch"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 931
a=0;//     const-string v2, "patch"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 933
a=0;//     :cond_3
a=0;//     #v2=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 824
a=0;//     invoke-static {p0}, Lsafiap/framework/util/a;->b(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 825
a=0;//     invoke-static {p0}, Lsafiap/framework/util/a;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 828
a=0;//     :cond_0
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->ACTION_CALLER_PKG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 829
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "onBind().Intent: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", mBinder:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", caller_package: "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 831
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 832
a=0;//     new-instance v1, Lsafiap/framework/SafFrameworkManager$f;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/SafFrameworkManager$f;);
a=0;//     invoke-direct {v1, p0, v0}, Lsafiap/framework/SafFrameworkManager$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 833
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$f;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->E:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 836
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 791
a=0;//     invoke-super {p0}, Landroid/app/Service;->onCreate()V
a=0;// 
a=0;//     .line 792
a=0;//     iput-object p0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 793
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "SAF-IAP main service onCreate(), it\'s version is:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 794
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 797
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 798
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "mTaskPool == null"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 799
a=0;//     new-instance v0, Ljava/util/Hashtable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Hashtable;);
a=0;//     invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Hashtable;);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager;->y:Ljava/util/Map;
a=0;// 
a=0;//     .line 801
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 856
a=0;//     invoke-super {p0}, Landroid/app/Service;->onDestroy()V
a=0;// 
a=0;//     .line 857
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 805
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 806
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "new intent at onStartCommand ... action: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 807
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 808
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 809
a=0;//     const-string v1, "safiap.framework.ACTION_CHECK_UPDATE"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 810
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v1, "action check update"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 811
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/SafFrameworkManager;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 818
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 812
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "safiap.framework.ACTION_FOREGROUND"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 813
a=0;//     const-string v0, "safiap.framework.KEY_FOREGROUND"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     sput-boolean v0, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     .line 814
a=0;//     sget-object v0, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "reset foreground: "
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-boolean v2, Lsafiap/framework/SafFrameworkManager;->j:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onUnbind(Landroid/content/Intent;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 845
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->ACTION_CALLER_PKG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 846
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager;->e:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "onBind().Intent: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", mBinder:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/SafFrameworkManager;->C:Lsafiap/framework/sdk/ISAFFramework$Stub;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ", caller_package: "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 848
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 849
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager;->E:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 851
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/app/Service;->onUnbind(Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
