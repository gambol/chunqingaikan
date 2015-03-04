package cn.waps; class ba { void a() { int a;
a=0;// .class Lcn/waps/ba;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Z
a=0;// 
a=0;// .field final synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic c:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic d:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic e:Lcn/waps/ay;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/ay;ZLjava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ba;->e:Lcn/waps/ay;
a=0;// 
a=0;//     iput-boolean p2, p0, Lcn/waps/ba;->a:Z
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/ba;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/ba;->c:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcn/waps/ba;->d:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ba;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-boolean v0, p0, Lcn/waps/ba;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ba;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "video/*"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcn/waps/ba;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_0
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ba;->d:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/content/Intent;);v1=(Boolean);v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcn/waps/ba;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
