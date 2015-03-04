package safiap.framework; class UpdateManager { void a() { int a;
a=0;// .class public Lsafiap/framework/UpdateManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/UpdateManager$CheckApkUpdateTask;,
a=0;//         Lsafiap/framework/UpdateManager$OnGotUpdateListListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static FLAG_INSTALL_FAILED:I = 0x7d1
a=0;// 
a=0;// .field private static FLAG_INSTALL_SUCCESSFUL:I = 0x7d0
a=0;// 
a=0;// .field private static MAX_INSTALL_TIME_MILLIS:J = 0xea60L
a=0;// 
a=0;// .field public static final MSG_FINISH_DOWNLOAD:I = 0x3ea
a=0;// 
a=0;// .field public static final MSG_START_DOWNLOAD:I = 0x3e9
a=0;// 
a=0;// .field public static final MSG_UPDATE_PROGRESS:I = 0x3ee
a=0;// 
a=0;// .field private static TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static TYPE_PLUGINS:Ljava/lang/String;
a=0;// 
a=0;// .field private static logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAppContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     const-string v0, "UpdateManager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lsafiap/framework/UpdateManager;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 48
a=0;//     const-string v0, "plugins"
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/UpdateManager;->TYPE_PLUGINS:Ljava/lang/String;
a=0;// 
a=0;//     .line 160
a=0;//     const-class v0, Lsafiap/framework/UpdateManager;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/UpdateManager;->logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lsafiap/framework/UpdateManager;);
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     const-string v1, "UpdateManager() ----------------"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 26
a=0;//     iput-object p1, p0, Lsafiap/framework/UpdateManager;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 27
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/UpdateManager;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     iget-object v0, p0, Lsafiap/framework/UpdateManager;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Lsafiap/framework/util/MyLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static pickPluginUpdateItems(Landroid/content/Context;Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 17
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/a/b;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     new-instance v15, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 135
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static/range {p0 .. p0}, Lsafiap/framework/a/c;->a(Landroid/content/Context;)Lsafiap/framework/a/c;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 137
a=0;//     #v1=(Reference,Lsafiap/framework/a/c;);
a=0;//     invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object v13, v2
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 139
a=0;//     iget-boolean v2, v13, Lsafiap/framework/a/b;->i:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     iget-object v2, v13, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object v14, v2
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v14, Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 143
a=0;//     if-eqz v14, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     iget v2, v13, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v14, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v2, v3, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v2, v13, Lsafiap/framework/a/b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, v13, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v13, Lsafiap/framework/a/b;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget v5, v14, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v13, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-boolean v7, v13, Lsafiap/framework/a/b;->h:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     iget-object v8, v13, Lsafiap/framework/a/b;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v9, v13, Lsafiap/framework/a/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     iget-object v10, v13, Lsafiap/framework/a/b;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iget-object v11, v13, Lsafiap/framework/a/b;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     iget-object v12, v13, Lsafiap/framework/a/b;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v1 .. v12}, Lsafiap/framework/a/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 150
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-object v4, Lsafiap/framework/UpdateManager;->logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "after update database, affected rows:"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ",ActionName:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v13, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 152
a=0;//     invoke-interface {v15, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     #v5=(Integer);v6=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 157
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-object v15
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public startQueryUpdateTask(Lsafiap/framework/UpdateManager$OnGotUpdateListListener;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     sget-object v0, Lsafiap/framework/UpdateManager;->logger:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "startQueryAllUpdateTask...start, extraArgu: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 32
a=0;//     new-instance v0, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/UpdateManager$CheckApkUpdateTask;);
a=0;//     sget-object v1, Lsafiap/framework/UpdateManager;->TYPE_PLUGINS:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, p0, v1, p1}, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;-><init>(Lsafiap/framework/UpdateManager;Ljava/lang/String;Lsafiap/framework/UpdateManager$OnGotUpdateListListener;)V
a=0;// 
a=0;//     .line 33
a=0;//     #v0=(Reference,Lsafiap/framework/UpdateManager$CheckApkUpdateTask;);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 34
a=0;//     invoke-static {v0, p2}, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->a(Lsafiap/framework/UpdateManager$CheckApkUpdateTask;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->URL_CHECK_UPDATE:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/UpdateManager$CheckApkUpdateTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
}}
