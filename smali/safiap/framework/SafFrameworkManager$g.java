package safiap.framework; class SafFrameworkManager$g { void a() { int a;
a=0;// .class final Lsafiap/framework/SafFrameworkManager$g;
a=0;// .super Landroid/os/Handler;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/SafFrameworkManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "g"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     iput-object p1, p0, Lsafiap/framework/SafFrameworkManager$g;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager$g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lsafiap/framework/SafFrameworkManager;B)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-direct {p0, p1}, Lsafiap/framework/SafFrameworkManager$g;-><init>(Lsafiap/framework/SafFrameworkManager;)V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/SafFrameworkManager$g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "action_name"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$g;->a:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 108
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :pswitch_0
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->d:Lsafiap/framework/SafFrameworkManager$b;
a=0;// 
a=0;//     .line 112
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v0}, Lsafiap/framework/SafFrameworkManager$b;->a()Lsafiap/framework/a/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/a/b;);
a=0;//     iget-object v1, v1, Lsafiap/framework/a/b;->f:Ljava/lang/String;
a=0;// 
a=0;//     .line 114
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/SafFrameworkManager$b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 109
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
