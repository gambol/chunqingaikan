package safiap.framework.a; class c { void a() { int a;
a=0;// .class public final Lsafiap/framework/a/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/a/c$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static A:I = 0x0
a=0;// 
a=0;// .field private static B:I = 0x2
a=0;// 
a=0;// .field private static C:I = 0x1
a=0;// 
a=0;// .field private static D:I = 0x0
a=0;// 
a=0;// .field private static a:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "SafFrameworkDB"
a=0;// 
a=0;// .field private static d:Lsafiap/framework/a/c; = null
a=0;// 
a=0;// .field private static e:Lsafiap/framework/a/c$a; = null
a=0;// 
a=0;// .field private static final f:Ljava/lang/String; = "PluginInfo"
a=0;// 
a=0;// .field private static g:Ljava/lang/String; = "_id"
a=0;// 
a=0;// .field private static h:Ljava/lang/String; = "cnname"
a=0;// 
a=0;// .field private static i:Ljava/lang/String; = "action_name"
a=0;// 
a=0;// .field private static j:Ljava/lang/String; = "package_name"
a=0;// 
a=0;// .field private static k:Ljava/lang/String; = "version"
a=0;// 
a=0;// .field private static l:Ljava/lang/String; = "version_latest"
a=0;// 
a=0;// .field private static m:Ljava/lang/String; = "update_option"
a=0;// 
a=0;// .field private static n:Ljava/lang/String; = "needsafe"
a=0;// 
a=0;// .field private static o:Ljava/lang/String; = "lastupdateVERSION"
a=0;// 
a=0;// .field private static p:Ljava/lang/String; = "isdownloading"
a=0;// 
a=0;// .field private static q:Ljava/lang/String; = "description"
a=0;// 
a=0;// .field private static r:Ljava/lang/String; = "UpdateURL"
a=0;// 
a=0;// .field private static s:Ljava/lang/String; = "isinstalling"
a=0;// 
a=0;// .field private static t:Ljava/lang/String; = "downloadedfile_name"
a=0;// 
a=0;// .field private static u:Ljava/lang/String; = "downloadedfile_version"
a=0;// 
a=0;// .field private static v:Ljava/lang/String; = "digest"
a=0;// 
a=0;// .field private static w:Ljava/lang/String; = "app_size"
a=0;// 
a=0;// .field private static x:Ljava/lang/String; = "app_update_type"
a=0;// 
a=0;// .field private static y:I = -0x1
a=0;// 
a=0;// .field private static z:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final c:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     const-class v0, Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     .line 29
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lsafiap/framework/a/c;);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "Get in SafFrameworkDB..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     iput-object p1, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     .line 56
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 59
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/a/c;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     iget-object v0, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     const-class v1, Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Get in SafFrameworkDB instance ...mSafFrameworkDB: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v3, Lsafiap/framework/a/c;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 35
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 44
a=0;//     :goto_0
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     sget-object v0, Lsafiap/framework/a/c;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v2, "make a new SafFrameworkDB object..."
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Lsafiap/framework/a/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->d:Lsafiap/framework/a/c;
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     sget-object v0, Lsafiap/framework/a/c;->d:Lsafiap/framework/a/c;
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 33
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Lsafiap/framework/util/MyLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a(Ljava/lang/String;)I
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 153
a=0;//     #v8=(Byte);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 231
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(One);v10=(Uninit);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 162
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name = \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 165
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 167
a=0;//     const-string v0, "downloadedfile_name"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 169
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 170
a=0;//     #v4=(Integer);
a=0;//     const-string v0, "version_latest"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 172
a=0;//     #v5=(Integer);
a=0;//     const-string v0, "downloadedfile_version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v1, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-static {v1, v3, v6}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 177
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     move v1, v9
a=0;// 
a=0;//     .line 179
a=0;//     :goto_1
a=0;//     sget-object v6, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v6=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "checkDownloadedApk().actionName:"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v9, ",downlowdedFileName:"
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     sget-object v3, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "version:"
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ",latestVersion:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ",downloadedFileVersion:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ",isReady:"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     if-le v5, v0, :cond_2
a=0;// 
a=0;//     .line 188
a=0;//     sget-object v3, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v6, "checkDownloadedApk(1).clear downloadFileVersion & downlaodFileName info"
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 190
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v6, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-static {v6, v3, v7}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 193
a=0;//     new-instance v3, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 194
a=0;//     #v3=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v6, "downloadedfile_name"
a=0;// 
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     const-string v6, "downloadedfile_version"
a=0;// 
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v3, v6, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "action_name =\'"
a=0;// 
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "\'"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 198
a=0;//     sget-object v7, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v9, "PluginInfo"
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     invoke-static {v7, v9, v3, v6, v10}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;// 
a=0;//     .line 202
a=0;//     :cond_2
a=0;//     #v10=(Conflicted);
a=0;//     if-ne v5, v0, :cond_6
a=0;// 
a=0;//     if-le v0, v4, :cond_6
a=0;// 
a=0;//     .line 204
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 221
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v4=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 222
a=0;//     invoke-interface {v2}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v1, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "checkDownloadedApk().return:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 227
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 228
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550013"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 230
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 231
a=0;//     #v0=(Byte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 177
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Integer);v6=(One);v7=(Null);v9=(One);v10=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 208
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ujava/lang/Object;);v9=(Reference,Ljava/lang/String;);v10=(Conflicted);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "checkDownloadedApk(2).clear downloadFileVersion & downlaodFileName info"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 211
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "downloadedfile_name"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 212
a=0;//     const-string v1, "downloadedfile_version"
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 214
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "action_name =\'"
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 215
a=0;//     sget-object v3, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v4, "PluginInfo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v0, v1, v5}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 216
a=0;//     #v0=(Byte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v5=(Integer);v9=(Conflicted);
a=0;//     move v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/String;I)J
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 131
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     sget-object v2, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v2, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v2, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v2, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     new-instance v2, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 113
a=0;//     #v2=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 114
a=0;//     const-string v3, "downloadedfile_name"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     if-lez p3, :cond_3
a=0;// 
a=0;//     .line 118
a=0;//     const-string v3, "downloadedfile_version"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 121
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name =\'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 122
a=0;//     sget-object v4, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v5, "PluginInfo"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v4, v5, v2, v3, v6}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 124
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-object v4, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "updateDownloadFileInfo().actionName:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ",fileName:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ",fileversion:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ",result:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     .line 127
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 128
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 129
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "SafFrameworkDB"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "SAF-A Exception:550003"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     sget-object v1, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     new-instance v1, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v1, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v1, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 389
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     new-instance v1, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 391
a=0;//     #v1=(Reference,Landroid/content/ContentValues;);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 392
a=0;//     const-string v2, "cnname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 395
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 396
a=0;//     const-string v2, "package_name"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 399
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     if-ltz p4, :cond_3
a=0;// 
a=0;//     .line 400
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 403
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ltz p5, :cond_4
a=0;// 
a=0;//     .line 404
a=0;//     const-string v2, "version_latest"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 407
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ltz p6, :cond_5
a=0;// 
a=0;//     .line 408
a=0;//     const-string v2, "update_option"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 414
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p7, :cond_6
a=0;// 
a=0;//     .line 415
a=0;//     const-string v2, "description"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 418
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz p10, :cond_7
a=0;// 
a=0;//     .line 419
a=0;//     const-string v2, "app_size"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 422
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz p11, :cond_8
a=0;// 
a=0;//     .line 423
a=0;//     const-string v2, "app_update_type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p11
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 426
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz p8, :cond_9
a=0;// 
a=0;//     .line 427
a=0;//     const-string v2, "UpdateURL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 430
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 431
a=0;//     const-string v2, "digest"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, p9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 434
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "action_name=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 436
a=0;//     sget-object v3, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v4, "PluginInfo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v1, v2, v5}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     .line 443
a=0;//     :goto_0
a=0;//     #v1=(LongLo);v2=(LongHi);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v1
a=0;// 
a=0;//     .line 439
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 440
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "SafFrameworkDB"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A Exception:550004"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 442
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 443
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)J
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name = \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 297
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 299
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "insertPluginInfo().update plugin:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ",version:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ". and return..."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 301
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 306
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eq v2, p4, :cond_1
a=0;// 
a=0;//     .line 308
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 312
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {p2}, Lsafiap/framework/sdk/b/d;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 313
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "version_latest"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 314
a=0;//     const-string v4, "downloadedfile_version"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v1, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 316
a=0;//     invoke-static {v2}, Lsafiap/framework/sdk/b/d;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 318
a=0;//     if-ge v4, v3, :cond_2
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v3, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v3, v2, v4}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 324
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/content/ContentValues;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_3
a=0;// 
a=0;//     .line 325
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "action_name=\'"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\'"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 327
a=0;//     :try_start_1
a=0;//     sget-object v3, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v4, "PluginInfo"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v3, v4, v0, v2, v5}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 333
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     .line 334
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 337
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     .line 361
a=0;//     :goto_1
a=0;//     #v0=(LongLo);v1=(LongHi);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 328
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);v1=(Reference,Landroid/database/Cursor;);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ujava/lang/Object;);v5=(Boolean);v6=(Null);v7=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 329
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 358
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 359
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550002"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 360
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 361
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 339
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/database/Cursor;);v2=(Null);v3=(Reference,Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 340
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "insertPluginInfo().check name and inseart ..FOR framework..."
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 346
a=0;//     new-instance v0, Landroid/content/ContentValues;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ContentValues;);
a=0;//     invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V
a=0;// 
a=0;//     .line 348
a=0;//     #v0=(Reference,Landroid/content/ContentValues;);
a=0;//     const-string v1, "cnname"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 349
a=0;//     const-string v1, "action_name"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 350
a=0;//     const-string v1, "package_name"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 351
a=0;//     const-string v1, "version"
a=0;// 
a=0;//     invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 352
a=0;//     const-string v1, "needsafe"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
a=0;// 
a=0;//     .line 353
a=0;//     const-string v1, "lastupdateVERSION"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 355
a=0;//     sget-object v1, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v2, "PluginInfo"
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-static {v1, v2, v3, v0}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final a()Landroid/database/Cursor;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 597
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 598
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 601
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 603
a=0;//     sget-object v2, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "selectAll().cursor counts:"
a=0;// 
a=0;//     invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 609
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 603
a=0;//     :cond_1
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 606
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 607
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550010"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 608
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 609
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final b(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "get downloaded apk file path for actionName:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 273
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 248
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name = \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 255
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 256
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getDownloadAPKname().("
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ") and fileName is:("
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "downloadedfile_name"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " )."
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 262
a=0;//     const-string v0, "downloadedfile_name"
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 265
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 266
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 272
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v1, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getDownloadAPKname().result:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
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
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 269
a=0;//     :goto_3
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SafFrameworkDB"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "SAF-A Exception:550013"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 268
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Null);v8=(Null);
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final c(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 482
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 486
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "action_name=\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 489
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "app_size"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 493
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 494
a=0;//     const-string v0, "app_size"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 500
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 501
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 509
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 496
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     const-string v0, "SafFrameworkDB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 504
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 505
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 508
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 509
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final d(Ljava/lang/String;)I
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 520
a=0;//     #v8=(Byte);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 521
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 524
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "action_name=\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 527
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const-string v5, "version_latest"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     aput-object v5, v2, v4
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 531
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 532
a=0;//     const-string v0, "version_latest"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 538
a=0;//     :goto_0
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 539
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 547
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 534
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Reference,[Ljava/lang/String;);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     const-string v0, "SafFrameworkDB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 542
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 543
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 546
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 547
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final e(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 558
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 559
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 561
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "action_name=\'"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\'"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 564
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 568
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 569
a=0;//     const-string v0, "app_update_type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 577
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 578
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 587
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 572
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);
a=0;//     const-string v0, "SafFrameworkDB"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 582
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 583
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     const-string v2, "SAF-A Exception:550007(query)"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 586
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move-object v0, v8
a=0;// 
a=0;//     .line 587
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public final f(Ljava/lang/String;)Z
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 620
a=0;//     .line 622
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 623
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 627
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name = \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 630
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 631
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "isHasUpdate().name:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ",count:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 633
a=0;//     const-string v0, "version_latest"
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 634
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 635
a=0;//     sget-object v3, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "versionLatest is:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ",version is:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 637
a=0;//     if-le v0, v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/a/c;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2, p1, v0}, Lsafiap/framework/a/a;->b(Landroid/content/Context;Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 638
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 642
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 649
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 646
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 647
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550013"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 648
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 649
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Null);v7=(Null);
a=0;//     move v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final g(Ljava/lang/String;)Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 654
a=0;//     .line 656
a=0;//     #v8=(Null);
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 657
a=0;//     new-instance v0, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 661
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     sget-object v0, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     const-string v1, "PluginInfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "action_name = \'"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\'"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 664
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 665
a=0;//     sget-object v0, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "isHasUpdate().name:"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ",count:"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 667
a=0;//     const-string v0, "version_latest"
a=0;// 
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 668
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 669
a=0;//     sget-object v3, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "versionLatest is:"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ",version is:"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 672
a=0;//     const-string v3, "update_option"
a=0;// 
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 674
a=0;//     sget-object v4, Lsafiap/framework/a/c;->a:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "PluginMandatoryUpdateCheck(). result :("
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, ")"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 675
a=0;//     if-le v0, v2, :cond_2
a=0;// 
a=0;//     if-ne v3, v9, :cond_2
a=0;// 
a=0;//     move v0, v9
a=0;// 
a=0;//     .line 680
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 681
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 687
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 684
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 685
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SafFrameworkDB"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "SAF-A Exception:550013"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 686
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     .line 687
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Reference,Lsafiap/framework/util/MyLogger;);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);v7=(Null);
a=0;//     move v0, v8
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final h(Ljava/lang/String;)J
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     .line 698
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 717
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-wide v0
a=0;// 
a=0;//     .line 702
a=0;//     :cond_1
a=0;//     #v2=(Boolean);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     sget-object v2, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 703
a=0;//     new-instance v2, Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/a/c$a;);
a=0;//     invoke-direct {v2, p0}, Lsafiap/framework/a/c$a;-><init>(Lsafiap/framework/a/c;)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     sput-object v2, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     .line 706
a=0;//     :cond_2
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 711
a=0;//     :try_start_0
a=0;//     sget-object v2, Lsafiap/framework/a/c;->e:Lsafiap/framework/a/c$a;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/a/c$a;);
a=0;//     const-string v3, "PluginInfo"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "action_name=\'"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "\'"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v2, v3, v4, v5}, Lsafiap/framework/a/c$a;->a(Lsafiap/framework/a/c$a;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 714
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 715
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v3, "SafFrameworkDB"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "SAF-A Exception:550017"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
