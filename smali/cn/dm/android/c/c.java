package cn.dm.android.c; class c { void a() { int a;
a=0;// .class public Lcn/dm/android/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private c:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcn/dm/android/c/e;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcn/dm/android/c/c;);
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/c/c;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/dm/android/c/c;->c:Ljava/util/List;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p1, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/c/c;)Lcn/dm/android/f/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcn/dm/android/c/e;
a=0;// 
a=0;//     .line 234
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/model/b;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {v0}, Lcn/dm/android/c/e;->b()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Lcn/dm/android/c/e;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->c:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 242
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(Lcn/dm/android/c/e;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->c:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Lcn/dm/android/c/c$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/c/c$2;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/c/c$2;-><init>(Lcn/dm/android/c/c;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/c$2;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/c/c;->b(Lcn/dm/android/listener/c;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 226
a=0;//     :goto_0
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-virtual {p1}, Lcn/dm/android/c/e;->b()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/dm/android/c/c;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/dm/android/c/c;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Lcn/dm/android/c/c;->a()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "consuming points"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "cpt"
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v1, Lcn/dm/android/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/c/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v3, Lcn/dm/android/c/a;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v1, v2, p2, v0, v3}, Lcn/dm/android/c/b;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/c/b;);
a=0;//     invoke-direct {p0, v1}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "checking points"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Lcn/dm/android/c/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/c/b;);
a=0;//     iget-object v1, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Lcn/dm/android/c/a;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, p1, v2, v3}, Lcn/dm/android/c/b;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/b;);
a=0;//     invoke-direct {p0, v0}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "getting offer list"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ids"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v1, Lcn/dm/android/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/c/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget-object v3, Lcn/dm/android/c/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, p2, v0, v3}, Lcn/dm/android/c/b;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/c/b;);
a=0;//     invoke-direct {p0, v1}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     .line 139
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "doing report:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 142
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 143
a=0;//     const-string v1, "sid"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 145
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     const-string v1, "tr"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const-string v1, "state_report"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     const-string v1, "data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/f/i;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     :goto_0
a=0;//     new-instance v1, Lcn/dm/android/c/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/c/d;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     new-instance v3, Lcn/dm/android/c/c$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcn/dm/android/c/c$1;);
a=0;//     invoke-direct {v3, p0, p2}, Lcn/dm/android/c/c$1;-><init>(Lcn/dm/android/c/c;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcn/dm/android/c/c$1;);
a=0;//     invoke-direct {v1, v2, v3, v0, p1}, Lcn/dm/android/c/d;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/c/d;);
a=0;//     invoke-direct {p0, v1}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v3=(Uninit);
a=0;//     sget-object p1, Lcn/dm/android/c/a;->h:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "getting config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "template_vn"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/b/b;->b(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 68
a=0;//     #v0=(Integer);
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "template_vn"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 71
a=0;//     new-instance v0, Lcn/dm/android/c/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/c/e;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v3, Lcn/dm/android/c/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, p1, v1, v3}, Lcn/dm/android/c/e;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/e;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/c/e;->b()V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "getting app detail"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 102
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v1, Lcn/dm/android/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/c/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget-object v3, Lcn/dm/android/c/a;->d:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, p2, v0, v3}, Lcn/dm/android/c/b;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/c/b;);
a=0;//     invoke-direct {p0, v1}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 105
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c;->b:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "getting re-open list"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 119
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ids"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v1, Lcn/dm/android/c/b;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/c/b;);
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget-object v3, Lcn/dm/android/c/a;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, p2, v0, v3}, Lcn/dm/android/c/b;-><init>(Landroid/content/Context;Lcn/dm/android/listener/c;Ljava/util/HashMap;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/c/b;);
a=0;//     invoke-direct {p0, v1}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/e;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
}}
