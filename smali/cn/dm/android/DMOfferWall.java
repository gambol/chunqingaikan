package cn.dm.android; class DMOfferWall { void a() { int a;
a=0;// .class public Lcn/dm/android/DMOfferWall;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/DMOfferWall$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private static b:Lcn/dm/android/a/a;
a=0;// 
a=0;// .field private static c:Lcn/dm/android/a/b;
a=0;// 
a=0;// .field private static e:Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     sput-object v0, Lcn/dm/android/DMOfferWall;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 99
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 113
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Start to init DMOfferWall"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 114
a=0;//     iput-object p1, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v2, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-class v3, Lcn/dm/android/DMService;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/a/b;->a(Landroid/content/Context;)Lcn/dm/android/a/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v0, Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/OfferWallExecutor;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/OfferWallExecutor;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferWall;->f:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(ILcn/dm/android/listener/OfferObjectListener;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/dm/android/a/b;->a(ILcn/dm/android/listener/OfferObjectListener;)V
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/content/Context;)Lcn/dm/android/DMOfferWall;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->e:Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, v0}, Lcn/dm/android/DMOfferWall;->init(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->e:Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static init(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "publisherId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lcn/dm/android/DMOfferWall;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "publisherId"    # Ljava/lang/String;
a=0;//     .param p2, "userid"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "publisherId \u5a92\u4f53ID\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->f(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->e:Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/DMOfferWall;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/DMOfferWall;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/DMOfferWall;);
a=0;//     sput-object v0, Lcn/dm/android/DMOfferWall;->e:Lcn/dm/android/DMOfferWall;
a=0;// 
a=0;//     .line 77
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p0, p1}, Lcn/dm/android/c/f;->b(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/android/a/a;->a()V
a=0;// 
a=0;//     .line 83
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/android/a/b;->a()V
a=0;// 
a=0;//     .line 85
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     const-string v1, "state_report"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {p0}, Lcn/dm/android/f/a;->z(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 88
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public adListItemClick(Landroid/content/Context;Lcn/dm/android/model/AOWObject;Lcn/dm/android/listener/OfferObjectListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "aowObject"    # Lcn/dm/android/model/AOWObject;
a=0;//     .param p3, "offerObjectListener"    # Lcn/dm/android/listener/OfferObjectListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, "item_clicked"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p2, Lcn/dm/android/model/AOWObject;->tr:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-boolean v0, p2, Lcn/dm/android/model/AOWObject;->open_detail:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 198
a=0;//     iget v0, p2, Lcn/dm/android/model/AOWObject;->id:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, p3}, Lcn/dm/android/DMOfferWall;->a(ILcn/dm/android/listener/OfferObjectListener;)V
a=0;// 
a=0;//     .line 202
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 200
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, p2}, Lcn/dm/android/DMOfferWall;->doTaskClick(Landroid/content/Context;Lcn/dm/android/model/AOWObject;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkPoints(Lcn/dm/android/listener/CheckPointListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "paramCheckPointsListener"    # Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-virtual {v0, p1}, Lcn/dm/android/a/b;->a(Lcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public consumePoints(ILcn/dm/android/listener/CheckPointListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "paramConsumePoint"    # I
a=0;//     .param p2, "paramConsumeListener"    # Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-virtual {v0, p1, p2}, Lcn/dm/android/a/b;->a(ILcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     .line 255
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public doTaskClick(Landroid/content/Context;Lcn/dm/android/model/AOWObject;)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "aowObject"    # Lcn/dm/android/model/AOWObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iget-object v5, p2, Lcn/dm/android/model/AOWObject;->action_url:Ljava/lang/String;
a=0;// 
a=0;//     .line 225
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     iget-boolean v4, p2, Lcn/dm/android/model/AOWObject;->executable:Z
a=0;// 
a=0;//     .line 226
a=0;//     #v4=(Boolean);
a=0;//     iget-object v3, p2, Lcn/dm/android/model/AOWObject;->texts:Ljava/lang/String;
a=0;// 
a=0;//     .line 227
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p2, Lcn/dm/android/model/AOWObject;->tr:Ljava/lang/String;
a=0;// 
a=0;//     .line 228
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->f:Lcn/dm/android/OfferWallExecutor;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/OfferWallExecutor;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual/range {v0 .. v5}, Lcn/dm/android/OfferWallExecutor;->doAction(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAdList(ILcn/dm/android/listener/OfferListListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "adSize"    # I
a=0;//     .param p2, "offerListListener"    # Lcn/dm/android/listener/OfferListListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-virtual {v0, p2, p1}, Lcn/dm/android/a/b;->b(Lcn/dm/android/listener/OfferListListener;I)V
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getPageSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/b;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/model/b;->g()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getReopenAdList(ILcn/dm/android/listener/OfferListListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "adSize"    # I
a=0;//     .param p2, "offerListListener"    # Lcn/dm/android/listener/OfferListListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->c:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-virtual {v0, p2, p1}, Lcn/dm/android/a/b;->a(Lcn/dm/android/listener/OfferListListener;I)V
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getUnitName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/b;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/model/b;->h()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onAOWExit()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, "wall_close"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAOWLaunch()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, "wall_present"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onResume(Lcn/dm/android/listener/b;)V
a=0;//     .locals 1
a=0;//     .param p1, "taskStateListener"    # Lcn/dm/android/listener/b;
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Lcn/dm/android/e/b;->a(Lcn/dm/android/listener/b;)V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public reportShowList(Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "tr"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, "show_list"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEnabledShowNetWorkDialog(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabledShowNetWorkDialog"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0, p1}, Lcn/dm/android/c/f;->a(Landroid/content/Context;Z)V
a=0;// 
a=0;//     .line 263
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setUserId(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "userId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     sget-object v0, Lcn/dm/android/DMOfferWall;->b:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     invoke-virtual {v0, p1}, Lcn/dm/android/a/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showOfferWall(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     invoke-static {p1}, Lcn/dm/android/DMOfferActivity;->start_offerwall(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferWall;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "open_offerwall"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/f/i;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// .end method
}}
