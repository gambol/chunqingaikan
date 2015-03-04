package com.tencent.stat.common; class c { void a() { int a;
a=0;// .class Lcom/tencent/stat/common/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/String;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field e:Ljava/lang/String;
a=0;// 
a=0;// .field f:Ljava/lang/String;
a=0;// 
a=0;// .field g:Ljava/lang/String;
a=0;// 
a=0;// .field h:Ljava/lang/String;
a=0;// 
a=0;// .field i:Ljava/lang/String;
a=0;// 
a=0;// .field j:Ljava/lang/String;
a=0;// 
a=0;// .field k:Ljava/lang/String;
a=0;// 
a=0;// .field l:I
a=0;// 
a=0;// .field m:Ljava/lang/String;
a=0;// 
a=0;// .field n:Landroid/content/Context;
a=0;// 
a=0;// .field private o:Ljava/lang/String;
a=0;// 
a=0;// .field private p:Ljava/lang/String;
a=0;// 
a=0;// .field private q:Ljava/lang/String;
a=0;// 
a=0;// .field private r:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/common/c;);
a=0;//     const-string v0, "1.6.2"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/stat/common/c;->d:I
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/stat/common/c;->l:I
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->n:Landroid/content/Context;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->o:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->q:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v1, p0, Lcom/tencent/stat/common/c;->r:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/common/c;->n:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->d(Landroid/content/Context;)Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->n(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/StatConfig;->getInstallChannel(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->m(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->s(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/tencent/stat/common/c;->l:I
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->t(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/common/c;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->A(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->o:Ljava/lang/String;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->z(Landroid/content/Context;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1}, Lcom/tencent/stat/common/k;->x(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->q:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->e()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/stat/common/c;->r:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/content/Context;Lcom/tencent/stat/common/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lcom/tencent/stat/common/c;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/common/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(Lorg/json/JSONObject;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const-string v0, "sr"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/c;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v2=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "*"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/c;->c:Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I
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
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "av"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ch"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mf"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "sv"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ov"
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/stat/common/c;->d:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "os"
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "op"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "lg"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "md"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "tz"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/stat/common/c;->l:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "jb"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Lcom/tencent/stat/common/c;->l:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "sd"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "apn"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/common/c;->n:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "bs"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/c;->n:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v2}, Lcom/tencent/stat/common/k;->C(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v1, "ss"
a=0;// 
a=0;//     iget-object v2, p0, Lcom/tencent/stat/common/c;->n:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/tencent/stat/common/k;->D(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     const-string v1, "wf"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {p1, v1, v0}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v0, "sen"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->o:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "cpu"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "ram"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->q:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "rom"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/common/c;->r:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
