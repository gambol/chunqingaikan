package cn.waps.a; class j { void a() { int a;
a=0;// .class Lcn/waps/a/j;
a=0;// .super Landroid/os/AsyncTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Lcn/waps/a/b;
a=0;// 
a=0;// .field b:Landroid/app/Dialog;
a=0;// 
a=0;// .field c:Lcn/waps/a/p;
a=0;// 
a=0;// .field d:I
a=0;// 
a=0;// .field final synthetic e:Lcn/waps/a/i;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/a/i;Lcn/waps/a/b;Landroid/app/Dialog;Lcn/waps/a/p;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/a/j;->e:Lcn/waps/a/i;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/a/j;);
a=0;//     iput-object p2, p0, Lcn/waps/a/j;->a:Lcn/waps/a/b;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/a/j;->b:Landroid/app/Dialog;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/a/j;->c:Lcn/waps/a/p;
a=0;// 
a=0;//     iput p5, p0, Lcn/waps/a/j;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/String;)Lcn/waps/a/p;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->c:Lcn/waps/a/p;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/p;);
a=0;//     invoke-virtual {v0}, Lcn/waps/a/p;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v2}, Ljava/net/URL;->openStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/a/j;->c:Lcn/waps/a/p;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Lcn/waps/a/p;->a(Landroid/graphics/Bitmap;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->c:Lcn/waps/a/p;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :goto_1
a=0;//     throw v0
a=0;// 
a=0;//     :catch_3
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Lcn/waps/a/p;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->b:Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->c:Lcn/waps/a/p;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->e:Lcn/waps/a/i;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/i;->b(Lcn/waps/a/i;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/a/k;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/a/k;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/a/k;-><init>(Lcn/waps/a/j;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/k;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->a:Lcn/waps/a/b;
a=0;// 
a=0;//     new-instance v1, Lcn/waps/a/l;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/a/l;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/a/l;-><init>(Lcn/waps/a/j;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/l;);
a=0;//     invoke-virtual {v0, v1}, Lcn/waps/a/b;->a(Lcn/waps/a/f;)V
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Lcn/waps/a/j;->e:Lcn/waps/a/i;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/a/i;->b(Lcn/waps/a/i;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/a/m;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/a/m;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/a/m;-><init>(Lcn/waps/a/j;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/a/m;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/a/j;->a([Ljava/lang/String;)Lcn/waps/a/p;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/a/p;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     check-cast p1, Lcn/waps/a/p;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/waps/a/j;->a(Lcn/waps/a/p;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
