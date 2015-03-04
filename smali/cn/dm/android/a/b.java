package cn.dm.android.a; class b { void a() { int a;
a=0;// .class public Lcn/dm/android/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/a/b$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static b:Lcn/dm/android/a/b;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private c:Lcn/dm/android/a/a;
a=0;// 
a=0;// .field private d:Landroid/content/Context;
a=0;// 
a=0;// .field private e:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private f:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private g:Ljava/lang/String;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcn/dm/android/a/b;);
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->e:Ljava/util/List;
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->f:Ljava/util/List;
a=0;// 
a=0;//     .line 63
a=0;//     const-string v0, "_success"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->g:Ljava/lang/String;
a=0;// 
a=0;//     .line 64
a=0;//     const-string v0, "_fail"
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p1, p0, Lcn/dm/android/a/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {p1}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/a/b;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Lcn/dm/android/a/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     sget-object v0, Lcn/dm/android/a/b;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/a/b;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/a/b;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     sput-object v0, Lcn/dm/android/a/b;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     .line 75
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/android/a/b;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(ILjava/util/List;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 272
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lt p1, v0, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 276
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/a/b;ILjava/util/List;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0, p1, p2}, Lcn/dm/android/a/b;->a(ILjava/util/List;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private b(ILjava/util/List;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(I",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 286
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 287
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 288
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/model/b;);
a=0;//     invoke-virtual {v1}, Lcn/dm/android/model/b;->g()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, p1
a=0;// 
a=0;//     .line 289
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     add-int v2, p1, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 290
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ","
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 289
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 292
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 293
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 296
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/dm/android/a/b;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/dm/android/a/b;)Lcn/dm/android/f/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcn/dm/android/a/b;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic e(Lcn/dm/android/a/b;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->f:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic f(Lcn/dm/android/a/b;)Ljava/util/List;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->e:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->f:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->f:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 323
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->e:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->e:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 326
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILcn/dm/android/listener/CheckPointListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Start to consume_Points"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     new-instance v1, Lcn/dm/android/a/b$3;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/a/b$3;);
a=0;//     invoke-direct {v1, p0, p2}, Lcn/dm/android/a/b$3;-><init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/a/b$3;);
a=0;//     invoke-virtual {v0, p1, v1}, Lcn/dm/android/a/a;->a(ILcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILcn/dm/android/listener/OfferObjectListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcn/dm/android/a/b$2;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/a/b$2;);
a=0;//     invoke-direct {v2, p0, p2}, Lcn/dm/android/a/b$2;-><init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/OfferObjectListener;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/a/b$2;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->c(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 138
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/android/listener/CheckPointListener;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Start to checkPoints"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     new-instance v1, Lcn/dm/android/a/b$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/a/b$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/dm/android/a/b$1;-><init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/CheckPointListener;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/a/b$1;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/a/a;->b(Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/android/listener/OfferListListener;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 190
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->f:Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {p0, p2, v0}, Lcn/dm/android/a/b;->b(ILjava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 194
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 195
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0, v1, v2}, Lcn/dm/android/listener/OfferListListener;->onResponse(Ljava/util/List;ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 199
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/a/a;);
a=0;//     new-instance v2, Lcn/dm/android/a/b$4;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/a/b$4;);
a=0;//     invoke-direct {v2, p0, p1, p2}, Lcn/dm/android/a/b$4;-><init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/OfferListListener;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/a/b$4;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcn/dm/android/a/a;->b(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/dm/android/model/Point;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "native_point"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p1, Lcn/dm/android/model/Point;->point:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/b/b;->a(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     invoke-static {p1}, Lcn/dm/android/model/Point;->parser(Ljava/lang/String;)Lcn/dm/android/model/Point;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Reference,Lcn/dm/android/model/Point;);
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/a/b;->a(Lcn/dm/android/model/Point;)V
a=0;// 
a=0;//     .line 314
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Lcn/dm/android/listener/OfferListListener;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-lez p2, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b;->e:Ljava/util/List;
a=0;// 
a=0;//     invoke-direct {p0, p2, v0}, Lcn/dm/android/a/b;->b(ILjava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0, v1, v2}, Lcn/dm/android/listener/OfferListListener;->onResponse(Ljava/util/List;ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 261
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 242
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iget-object v1, p0, Lcn/dm/android/a/b;->c:Lcn/dm/android/a/a;
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/a/a;);
a=0;//     new-instance v2, Lcn/dm/android/a/b$5;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/a/b$5;);
a=0;//     invoke-direct {v2, p0, p1, p2}, Lcn/dm/android/a/b$5;-><init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/OfferListListener;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/a/b$5;);
a=0;//     invoke-virtual {v1, v0, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
