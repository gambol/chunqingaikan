package safiap.framework.ui; class UpdateHintActivity { void a() { int a;
a=0;// .class public Lsafiap/framework/ui/UpdateHintActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lsafiap/framework/ui/UpdateHintActivity$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static d:Lsafiap/framework/util/MyLogger; = null
a=0;// 
a=0;// .field private static final r:I = -0x1
a=0;// 
a=0;// .field private static final s:I = 0x2710
a=0;// 
a=0;// .field private static final t:I = 0x4e20
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lsafiap/framework/ui/res/LayoutUpdateHintActivity;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// .field private c:Ljava/lang/String;
a=0;// 
a=0;// .field private e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;// .field private final f:I
a=0;// 
a=0;// .field private final g:I
a=0;// 
a=0;// .field private final h:I
a=0;// 
a=0;// .field private final i:I
a=0;// 
a=0;// .field private final j:I
a=0;// 
a=0;// .field private final k:I
a=0;// 
a=0;// .field private l:I
a=0;// 
a=0;// .field private m:Ljava/util/Queue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Queue",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private n:Z
a=0;// 
a=0;// .field private o:Z
a=0;// 
a=0;// .field private p:Z
a=0;// 
a=0;// .field private q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;// .field private u:Landroid/content/ServiceConnection;
a=0;// 
a=0;// .field private final v:Landroid/os/Handler;
a=0;// 
a=0;// .field private w:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const-string v0, "UpdateHintActivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lsafiap/framework/util/MyLogger;->getLogger(Ljava/lang/String;)Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 40
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Lsafiap/framework/ui/UpdateHintActivity;);
a=0;//     iput-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 44
a=0;//     const-string v0, "[SAF_FRAMEWORK_IAP]"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 47
a=0;//     iput-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     .line 48
a=0;//     iput v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     .line 59
a=0;//     iput-boolean v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->n:Z
a=0;// 
a=0;//     .line 60
a=0;//     iput-boolean v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     .line 61
a=0;//     iput-boolean v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->p:Z
a=0;// 
a=0;//     .line 63
a=0;//     iput-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 531
a=0;//     new-instance v0, Lsafiap/framework/ui/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/b;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/ui/b;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/b;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->u:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     .line 560
a=0;//     new-instance v0, Lsafiap/framework/ui/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/c;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/ui/c;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/c;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->v:Landroid/os/Handler;
a=0;// 
a=0;//     .line 646
a=0;//     new-instance v0, Lsafiap/framework/ui/UpdateHintActivity$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/UpdateHintActivity$a;);
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/ui/UpdateHintActivity$a;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/UpdateHintActivity$a;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->w:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/ui/UpdateHintActivity;Lsafiap/framework/sdk/ISAFFramework;)Lsafiap/framework/sdk/ISAFFramework;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/ui/res/d;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Lsafiap/framework/util/MyLogger;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     sget-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(I)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 225
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v1, 0x7532
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 231
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     .line 233
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 234
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 243
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     sget-object v3, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v4, "service is not connect..."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 239
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 245
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(II)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v5, 0x14
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 282
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     .line 284
a=0;//     iput-boolean v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->p:Z
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/16 v1, 0x7532
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne p2, v1, :cond_2
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     monitor-enter v2
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     monitor-exit v2
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     monitor-exit v2
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     sget-object v3, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     const-string v4, "service is not connect..."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Queue;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Queue;);
a=0;//     invoke-interface {v3, v0}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 288
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0, v5, p1}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     .line 324
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 290
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v1, 0x1030010
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v5, p1}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/a;);
a=0;//     invoke-direct {v1, p0}, Lsafiap/framework/ui/a;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/a;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/d;);
a=0;//     invoke-direct {v1, p0}, Lsafiap/framework/ui/d;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/d;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(III)V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x11
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0x8
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 328
a=0;//     #v4=(Null);
a=0;//     sget-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "createUpdateDialog()...componentType: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", iapVersion: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-direct {p0, v3}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0, v6, p3}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     .line 339
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->a()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 341
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->h()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u60a8\u624b\u673a\u4e0a\u7684\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u6709\u65b0\u7248\u672c\uff08\u5927\u5c0f\uff1a%sKB\uff09\u53ef\u4f9b\u5347\u7ea7\u3002"
a=0;// 
a=0;//     new-array v2, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     iget v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v2, v4
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 347
a=0;//     iget-boolean v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->n:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->b()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u7701\u6d41\u91cf\u5347\u7ea7"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 354
a=0;//     :goto_1
a=0;//     iget-boolean v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 355
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->e()Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     .line 357
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->f()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 365
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/e;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/e;);
a=0;//     invoke-direct {v1, p0, p3, p1}, Lsafiap/framework/ui/e;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/e;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/f;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/f;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lsafiap/framework/ui/f;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/f;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 398
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     .line 403
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 336
a=0;//     :cond_1
a=0;//     #v3=(One);
a=0;//     new-instance v0, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v1, 0x1030010
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v6, p3}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 351
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/Integer;);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->b()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\u7acb\u5373\u5347\u7ea7"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 360
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->f()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 362
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/LayoutDialog;->e()Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private a(IZI)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x12
a=0;// 
a=0;//     .line 460
a=0;//     #v3=(PosByte);
a=0;//     sget-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "createDownloadErrorDialog()...componentType is:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "; isMandatoryUpdate is :"
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
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 461
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0, v3, p3}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     .line 469
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/i;);
a=0;//     invoke-direct {v1, p0, p3, p1}, Lsafiap/framework/ui/i;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/i;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 479
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/j;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/j;);
a=0;//     invoke-direct {v1, p0, p2}, Lsafiap/framework/ui/j;-><init>(Lsafiap/framework/ui/UpdateHintActivity;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/j;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 493
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     .line 495
a=0;//     return-void
a=0;// 
a=0;//     .line 466
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v1, 0x1030010
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v3, p3}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/res/Configuration;)V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v12, 0x11
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/16 v11, 0x8
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 69
a=0;//     #v8=(Null);
a=0;//     const/16 v0, 0x21
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(PosByte);
a=0;//     iget v1, p1, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_7
a=0;// 
a=0;//     .line 71
a=0;//     const/16 v0, 0x22
a=0;// 
a=0;//     .line 76
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 77
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 79
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "UpdateHintActivity.....IntentAciton is: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 82
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     .line 85
a=0;//     :cond_2
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->ACTION_TO_UPDATE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     .line 88
a=0;//     const-string v2, "appUpdateType"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 90
a=0;//     const-string v3, "iapIsDownloading"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 91
a=0;//     #v3=(Boolean);
a=0;//     const-string v4, "iapApkSize"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 93
a=0;//     const-string v5, "iapApkVersion"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 94
a=0;//     #v5=(Integer);
a=0;//     const-string v6, "isMandatoryUpdate"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     iput-boolean v6, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     .line 96
a=0;//     iget v6, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 97
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 98
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     .line 103
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     iget v4, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-gtz v4, :cond_4
a=0;// 
a=0;//     .line 104
a=0;//     iput v9, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     .line 107
a=0;//     :cond_4
a=0;//     sget-object v4, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "mDownloadFilesize is:"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v7, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     const-string v4, "patch"
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 111
a=0;//     iput-boolean v9, p0, Lsafiap/framework/ui/UpdateHintActivity;->n:Z
a=0;// 
a=0;//     .line 113
a=0;//     :cond_5
a=0;//     sget-object v2, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "UpdateHintActivity.isMandatoryUpdate is:"
a=0;// 
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-boolean v6, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v6, ", mUpdateHint"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-boolean v6, p0, Lsafiap/framework/ui/UpdateHintActivity;->n:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     const-string v2, "UpdateType"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 125
a=0;//     #v1=(Integer);
a=0;//     sget-object v2, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "download UI ...., type:  "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-boolean v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->p:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 129
a=0;//     invoke-direct {p0, v0, v1}, Lsafiap/framework/ui/UpdateHintActivity;->a(II)V
a=0;// 
a=0;//     .line 176
a=0;//     :cond_6
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 72
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v1=(Integer);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     iget v1, p1, Landroid/content/res/Configuration;->orientation:I
a=0;// 
a=0;//     if-ne v1, v9, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     const/16 v0, 0x21
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 133
a=0;//     :cond_8
a=0;//     #v2=(Boolean);v3=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Integer);v6=(Reference,Ljava/lang/String;);v7=(Integer);
a=0;//     if-eq v1, v10, :cond_d
a=0;// 
a=0;//     .line 134
a=0;//     if-eqz v3, :cond_9
a=0;// 
a=0;//     .line 135
a=0;//     invoke-direct {p0, v0, v1}, Lsafiap/framework/ui/UpdateHintActivity;->a(II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 137
a=0;//     :cond_9
a=0;//     sget-object v2, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "createUpdateDialog()...componentType: "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", iapVersion: "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, v9}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_a
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v2, v12, v0}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->a()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u5347\u7ea7\u63d0\u793a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->h()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u60a8\u624b\u673a\u4e0a\u7684\u4e2d\u56fd\u79fb\u52a8\u8bdd\u8d39\u652f\u4ed8\u670d\u52a1\u6709\u65b0\u7248\u672c\uff08\u5927\u5c0f\uff1a%sKB\uff09\u53ef\u4f9b\u5347\u7ea7\u3002"
a=0;// 
a=0;//     new-array v4, v9, [Ljava/lang/Object;
a=0;// 
a=0;//     iget v6, p0, Lsafiap/framework/ui/UpdateHintActivity;->l:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v6, v4, v8
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->n:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->b()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u7701\u6d41\u91cf\u5347\u7ea7"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :goto_3
a=0;//     iget-boolean v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->e()Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->f()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     :goto_4
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v3, Lsafiap/framework/ui/e;
a=0;// 
a=0;//     #v3=(UninitRef,Lsafiap/framework/ui/e;);
a=0;//     invoke-direct {v3, p0, v0, v1}, Lsafiap/framework/ui/e;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/ui/e;);
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     new-instance v2, Lsafiap/framework/ui/f;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/ui/f;);
a=0;//     invoke-direct {v2, p0, v1, v5}, Lsafiap/framework/ui/f;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/f;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v0=(PosByte);v2=(Conflicted);
a=0;//     new-instance v2, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v3, 0x1030010
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v2, p0, v3, v12, v0}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->b()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u7acb\u5373\u5347\u7ea7"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_c
a=0;//     #v2=(Boolean);
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->f()Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v11}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/d;->a()Lsafiap/framework/ui/res/LayoutDialog;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lsafiap/framework/ui/res/LayoutDialog;->e()Landroid/widget/CheckBox;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Landroid/widget/CheckBox;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 140
a=0;//     :cond_d
a=0;//     #v2=(Boolean);v3=(Boolean);
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_e
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);v6=(Uninit);v7=(Uninit);
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->ACTION_TO_INSTALL:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_10
a=0;// 
a=0;//     .line 147
a=0;//     const-string v2, "actionName"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 149
a=0;//     const-string v3, "iapFileName"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 150
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 152
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 155
a=0;//     :cond_f
a=0;//     invoke-direct {p0, v2, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 158
a=0;//     :cond_10
a=0;//     #v1=(Reference,Landroid/content/Intent;);v3=(Boolean);
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->ACTION_TO_INSTALL_IAP:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_11
a=0;// 
a=0;//     .line 160
a=0;//     sget-object v2, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "install UI in IAP.... "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "iapFileName"
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     const-string v2, "actionName"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     const-string v3, "iapFileName"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     .line 164
a=0;//     sget-object v1, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "IAPFilepath in UpdateUI: "
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v4, p0, Lsafiap/framework/ui/UpdateHintActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     invoke-direct {p0, v2, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 166
a=0;//     :cond_11
a=0;//     #v3=(Boolean);
a=0;//     sget-object v3, Lsafiap/framework/util/Constants;->ACTION_NETWORK_ERROR:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_13
a=0;// 
a=0;//     .line 168
a=0;//     const-string v2, "UpdateType"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 169
a=0;//     #v2=(Integer);
a=0;//     const-string v3, "isMandatoryUpdate"
a=0;// 
a=0;//     invoke-virtual {v1, v3, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     .line 170
a=0;//     iget-boolean v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     sget-object v3, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "createDownloadErrorDialog()...componentType is:"
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "; isMandatoryUpdate is :"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-direct {p0, v9}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v3}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_12
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4, v0}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     :goto_5
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     iget-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v4, Lsafiap/framework/ui/i;
a=0;// 
a=0;//     #v4=(UninitRef,Lsafiap/framework/ui/i;);
a=0;//     invoke-direct {v4, p0, v0, v2}, Lsafiap/framework/ui/i;-><init>(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;// 
a=0;//     #v4=(Reference,Lsafiap/framework/ui/i;);
a=0;//     invoke-virtual {v3, v4}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     new-instance v2, Lsafiap/framework/ui/j;
a=0;// 
a=0;//     #v2=(UninitRef,Lsafiap/framework/ui/j;);
a=0;//     invoke-direct {v2, p0, v1}, Lsafiap/framework/ui/j;-><init>(Lsafiap/framework/ui/UpdateHintActivity;Z)V
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/ui/j;);
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(PosByte);v2=(Integer);v3=(Conflicted);v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v3=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v4, 0x1030010
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x12
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-direct {v3, p0, v4, v5, v0}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v3=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v3, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 173
a=0;//     :cond_13
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Boolean);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     sget-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "downloadApkbyAction, action: "
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
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     sget-object v0, Lsafiap/framework/util/Constants;->IAP_COMPONENT_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->w:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     .line 259
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     invoke-interface {v1, v0, p1}, Lsafiap/framework/sdk/ISAFFramework;->downloadPlugin(Lsafiap/framework/sdk/ISAFFrameworkCallback;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 260
a=0;//     :catch_0
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFrameworkCallback;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x13
a=0;// 
a=0;//     .line 408
a=0;//     #v3=(PosByte);
a=0;//     sget-object v0, Lsafiap/framework/ui/UpdateHintActivity;->d:Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "createInstallDialog()...actionName is:"
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
a=0;//     .line 410
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     .line 412
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     invoke-virtual {v0, v3, p2}, Lsafiap/framework/ui/res/d;->a(II)V
a=0;// 
a=0;//     .line 418
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/g;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/g;);
a=0;//     invoke-direct {v1, p0, p1}, Lsafiap/framework/ui/g;-><init>(Lsafiap/framework/ui/UpdateHintActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/g;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/h;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/h;);
a=0;//     invoke-direct {v1, p0}, Lsafiap/framework/ui/h;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/h;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->b(Lsafiap/framework/ui/res/LayoutDialog$a;)V
a=0;// 
a=0;//     .line 454
a=0;//     invoke-direct {p0}, Lsafiap/framework/ui/UpdateHintActivity;->b()V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->show()V
a=0;// 
a=0;//     .line 456
a=0;//     return-void
a=0;// 
a=0;//     .line 415
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/res/d;);
a=0;//     const v1, 0x1030010
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1, v3, p2}, Lsafiap/framework/ui/res/d;-><init>(Landroid/app/Activity;III)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/ui/UpdateHintActivity;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1, p2}, Lsafiap/framework/ui/UpdateHintActivity;->a(II)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/ui/UpdateHintActivity;Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/ui/UpdateHintActivity;->a(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lsafiap/framework/ui/UpdateHintActivity;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->v:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Z)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 513
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 514
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "safiap.framework.ACTION_FOREGROUND"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 515
a=0;//     const-string v1, "safiap.framework.KEY_FOREGROUND"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
a=0;// 
a=0;//     .line 516
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 517
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/ui/UpdateHintActivity;)Lsafiap/framework/sdk/ISAFFramework;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 499
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     new-instance v1, Lsafiap/framework/ui/res/d$a;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/ui/res/d$a;);
a=0;//     invoke-direct {v1, p0}, Lsafiap/framework/ui/res/d$a;-><init>(Lsafiap/framework/ui/UpdateHintActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/ui/res/d$a;);
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/ui/res/d;->a(Lsafiap/framework/ui/res/d$a;)V
a=0;// 
a=0;//     .line 510
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 555
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 556
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/16 v1, 0x4e20
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 557
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->v:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     .line 558
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lsafiap/framework/ui/UpdateHintActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/ui/UpdateHintActivity;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 520
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->u:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lsafiap/framework/ui/UpdateHintActivity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     .line 522
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lsafiap/framework/ui/UpdateHintActivity;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-boolean v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->o:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lsafiap/framework/ui/UpdateHintActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 525
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 526
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->u:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     .line 527
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 529
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lsafiap/framework/ui/UpdateHintActivity;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lsafiap/framework/ui/UpdateHintActivity;)Ljava/util/Queue;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->m:Ljava/util/Queue;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Queue;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic g(Lsafiap/framework/ui/UpdateHintActivity;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->v:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 182
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/ui/UpdateHintActivity;->a(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 183
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 189
a=0;//     new-instance v0, Lsafiap/framework/ui/res/LayoutUpdateHintActivity;
a=0;// 
a=0;//     #v0=(UninitRef,Lsafiap/framework/ui/res/LayoutUpdateHintActivity;);
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-direct {v0, p0}, Lsafiap/framework/ui/res/LayoutUpdateHintActivity;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/LayoutUpdateHintActivity;);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->a:Lsafiap/framework/ui/res/LayoutUpdateHintActivity;
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->a:Lsafiap/framework/ui/res/LayoutUpdateHintActivity;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 195
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     sget-object v1, Lsafiap/framework/util/Constants;->SAF_FRAMEWORK_SERVICE_ACTION:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lsafiap/framework/ui/UpdateHintActivity;->u:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Lsafiap/framework/ui/UpdateHintActivity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     .line 198
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->u:Landroid/content/ServiceConnection;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->q:Lsafiap/framework/sdk/ISAFFramework;
a=0;// 
a=0;//     .line 218
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lsafiap/framework/sdk/ISAFFramework;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onPause()V
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/ui/res/d;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Lsafiap/framework/ui/UpdateHintActivity;->e:Lsafiap/framework/ui/res/d;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/ui/res/d;->dismiss()V
a=0;// 
a=0;//     .line 273
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lsafiap/framework/ui/UpdateHintActivity;->a(Z)V
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {p0}, Lsafiap/framework/ui/UpdateHintActivity;->finish()V
a=0;// 
a=0;//     .line 275
a=0;//     return-void
a=0;// .end method
}}
