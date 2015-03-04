package cn.waps; class au { void a() { int a;
a=0;// .class Lcn/waps/au;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Lcn/waps/aq;
a=0;// 
a=0;// .field final synthetic c:Lcn/waps/at;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/at;Landroid/content/Context;Lcn/waps/aq;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/au;->c:Lcn/waps/at;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/au;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/au;->b:Lcn/waps/aq;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/au;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/au;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {}, Lcn/waps/at;->a()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     const-string v2, "prepare_to_download"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/au;->c:Lcn/waps/at;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/at;->c(Lcn/waps/at;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->delete()Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/au;->b:Lcn/waps/aq;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/waps/aq;->start()V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
