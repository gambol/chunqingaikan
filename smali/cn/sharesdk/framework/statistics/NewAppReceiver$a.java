package cn.sharesdk.framework.statistics; class NewAppReceiver$a { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver$a;);
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v1}, Lcn/sharesdk/framework/utils/R;->getCachePath(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->x()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcn/sharesdk/framework/utils/b;->y()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "ShareSDK"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v2}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/f;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/f;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/f;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, ".ba"
a=0;// 
a=0;//     invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/f;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     new-instance v0, Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/utils/f;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/framework/utils/f;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/f;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, ".ba"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/f;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcn/sharesdk/framework/utils/f;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Ljava/util/ArrayList;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/f;);
a=0;//     const-string v1, "buffered_apps"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lcn/sharesdk/framework/utils/f;->c(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     check-cast v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/util/ArrayList;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver$a;->a:Lcn/sharesdk/framework/utils/f;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/utils/f;);
a=0;//     const-string v1, "buffered_apps"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcn/sharesdk/framework/utils/f;->a(Ljava/lang/String;Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
