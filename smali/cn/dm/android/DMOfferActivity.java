package cn.dm.android; class DMOfferActivity { void a() { int a;
a=0;// .class public Lcn/dm/android/DMOfferActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final b:J = 0x5265c00L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/dm/android/f/e;
a=0;// 
a=0;// .field private c:Lcn/dm/android/ui/a;
a=0;// 
a=0;// .field private d:Lcn/dm/android/a/a;
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field private g:Landroid/app/ProgressDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcn/dm/android/DMOfferActivity;);
a=0;//     new-instance v0, Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/e;);
a=0;//     const-class v1, Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcn/dm/android/f/e;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     .line 40
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/dm/android/DMOfferActivity;->e:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/DMOfferActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->f:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/DMOfferActivity;Landroid/app/ProgressDialog;)Landroid/app/ProgressDialog;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iput-object p1, p0, Lcn/dm/android/DMOfferActivity;->f:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;ILjava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcn/dm/android/DMOfferActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 217
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 218
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/model/b;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/model/b;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/ui/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/ui/a;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/DMOfferActivity;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/DMOfferActivity;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/dm/android/model/b;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     invoke-virtual {p1}, Lcn/dm/android/model/b;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "Start to update template"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 288
a=0;//     :try_start_0
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/DMOfferActivity;->b(Lcn/dm/android/model/b;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 301
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 289
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v1, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/f/e;->a(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 294
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "No need to update template"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 298
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/ui/a;->d()V
a=0;// 
a=0;//     .line 299
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/ui/a;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Lcn/dm/android/ui/a;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     invoke-static {p0}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lcn/dm/android/DMOfferActivity$3;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/DMOfferActivity$3;);
a=0;//     invoke-direct {v2, p0, p1}, Lcn/dm/android/DMOfferActivity$3;-><init>(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/ui/a;)V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/DMOfferActivity$3;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->b(Ljava/lang/String;Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/b/b;);
a=0;//     invoke-virtual {v0, p1}, Lcn/dm/android/b/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "_beginTime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/b/b;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/dm/android/DMOfferActivity;)Lcn/dm/android/ui/a;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private b()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     iget v0, p0, Lcn/dm/android/DMOfferActivity;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 78
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/ui/a;->a()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcn/dm/android/DMOfferActivity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// 
a=0;//     .line 60
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/dm/a/a;->a(Landroid/content/Context;)Lcn/dm/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/dm/a/a;->d()V
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->d:Lcn/dm/android/a/a;
a=0;// 
a=0;//     const-string v1, "wall_present"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 64
a=0;//     invoke-direct {p0}, Lcn/dm/android/DMOfferActivity;->f()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v1, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/dm/android/ui/a;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     invoke-virtual {v0}, Lcn/dm/android/ui/a;->c()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private b(Lcn/dm/android/model/b;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 307
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->a()Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 311
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Lcn/dm/android/model/b;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Lcn/dm/android/DMOfferActivity$5;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/DMOfferActivity$5;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/dm/android/DMOfferActivity$5;-><init>(Lcn/dm/android/DMOfferActivity;Lcn/dm/android/model/b;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/DMOfferActivity$5;);
a=0;//     invoke-static {p0, v0, v1}, Lcn/dm/android/f/j;->a(Landroid/content/Context;Ljava/lang/String;Lcn/dm/android/f/j$a;)V
a=0;// 
a=0;//     .line 331
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/dm/android/DMOfferActivity;)Lcn/dm/android/f/e;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {p0}, Lcn/dm/android/b/b;->b(Landroid/content/Context;)Lcn/dm/android/b/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/b/b;);
a=0;//     const-string v1, "tasking_packages"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/b/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 92
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v1, Lcn/dm/android/DMOfferActivity$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/DMOfferActivity$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcn/dm/android/DMOfferActivity$1;-><init>(Lcn/dm/android/DMOfferActivity;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/DMOfferActivity$1;);
a=0;//     invoke-virtual {v1}, Lcn/dm/android/DMOfferActivity$1;->start()V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic d(Lcn/dm/android/DMOfferActivity;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private d()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget v0, p0, Lcn/dm/android/DMOfferActivity;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     invoke-direct {p0}, Lcn/dm/android/DMOfferActivity;->e()V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->f:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->f:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->a()Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->f:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p0}, Lcn/dm/android/e/b;->a(Landroid/content/Context;)Lcn/dm/android/e/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/e/b;);
a=0;//     new-instance v1, Lcn/dm/android/DMOfferActivity$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/DMOfferActivity$2;);
a=0;//     invoke-direct {v1, p0}, Lcn/dm/android/DMOfferActivity$2;-><init>(Lcn/dm/android/DMOfferActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/DMOfferActivity$2;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/e/b;->a(Lcn/dm/android/listener/b;)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private f()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/model/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     invoke-static {}, Lcn/dm/android/c/f;->a()Lcn/dm/android/model/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/dm/android/DMOfferActivity;->a(Lcn/dm/android/model/b;)V
a=0;// 
a=0;//     .line 277
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->a()Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->g:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 259
a=0;//     invoke-static {p0}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/dm/android/DMOfferActivity$4;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/DMOfferActivity$4;);
a=0;//     invoke-direct {v1, p0}, Lcn/dm/android/DMOfferActivity$4;-><init>(Lcn/dm/android/DMOfferActivity;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/DMOfferActivity$4;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/a/a;->a(Lcn/dm/android/listener/c;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static start_detail(Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "id"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, v0, p1}, Lcn/dm/android/DMOfferActivity;->a(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static start_help(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Lcn/dm/android/DMOfferActivity;->a(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static start_offerwall(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0, v0, v1}, Lcn/dm/android/DMOfferActivity;->a(Landroid/content/Context;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 184
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a()Landroid/app/Dialog;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 337
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 338
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 339
a=0;//     const-string v1, "\u6b63\u5728\u52a0\u8f7d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 340
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V
a=0;// 
a=0;//     .line 341
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
a=0;// 
a=0;//     .line 342
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 343
a=0;//     invoke-virtual {v0, v2}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     .line 344
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 345
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;//     .annotation runtime Landroid/webkit/JavascriptInterface;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "onCreate()"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {p0}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->d:Lcn/dm/android/a/a;
a=0;// 
a=0;//     .line 47
a=0;//     new-instance v0, Lcn/dm/android/ui/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/ui/a;);
a=0;//     invoke-direct {v0, p0}, Lcn/dm/android/ui/a;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/ui/a;);
a=0;//     iput-object v0, p0, Lcn/dm/android/DMOfferActivity;->c:Lcn/dm/android/ui/a;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p0}, Lcn/dm/android/DMOfferActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "type"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcn/dm/android/DMOfferActivity;->e:I
a=0;// 
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Lcn/dm/android/DMOfferActivity;->b()V
a=0;// 
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Lcn/dm/android/DMOfferActivity;->c()V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 351
a=0;//     iget-object v0, p0, Lcn/dm/android/DMOfferActivity;->a:Lcn/dm/android/f/e;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/e;);
a=0;//     const-string v1, "DMOfferActivity onDestroy"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 352
a=0;//     iget v0, p0, Lcn/dm/android/DMOfferActivity;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 354
a=0;//     invoke-static {p0}, Lcn/dm/android/a/a;->a(Landroid/content/Context;)Lcn/dm/android/a/a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/a;);
a=0;//     const-string v1, "wall_close"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lcn/dm/android/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 356
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onResume()V
a=0;// 
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Lcn/dm/android/DMOfferActivity;->d()V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
}}
