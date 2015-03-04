package cn.waps; class av { void a() { int a;
a=0;// .class Lcn/waps/av;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/at;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/at;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/av;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/av;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcn/waps/aq;->d:Z
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     #v3=(Reference,Lcn/waps/at;);
a=0;//     invoke-static {v3}, Lcn/waps/at;->d(Lcn/waps/at;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     invoke-static {v3}, Lcn/waps/at;->e(Lcn/waps/at;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/av;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     new-instance v1, Lcn/waps/af;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/af;);
a=0;//     iget-object v2, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/waps/at;->e(Lcn/waps/at;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lcn/waps/af;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/af;);
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Lcn/waps/at;Lcn/waps/af;)Lcn/waps/af;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/av;->a:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/av;->b:Lcn/waps/at;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/at;->f(Lcn/waps/at;)Lcn/waps/af;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/waps/at;->a(Landroid/content/Context;Lcn/waps/af;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
