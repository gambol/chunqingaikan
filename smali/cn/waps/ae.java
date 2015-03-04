package cn.waps; class ae { void a() { int a;
a=0;// .class Lcn/waps/ae;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Landroid/content/Context;
a=0;// 
a=0;// .field b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Lcn/waps/ad;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/ad;Landroid/content/Context;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ae;->c:Lcn/waps/ad;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ae;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/ae;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/ae;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/ae;->b:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ae;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     iget-object v1, p0, Lcn/waps/ae;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
