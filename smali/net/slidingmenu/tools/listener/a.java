package net.slidingmenu.tools.listener; class a { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/listener/a;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/util/SparseArray;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/listener/a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a()Lnet/slidingmenu/tools/listener/a;
a=0;//     .locals 2
a=0;// 
a=0;//     const-class v1, Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/listener/a;->a:Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/listener/a;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/listener/a;);
a=0;//     invoke-direct {v0}, Lnet/slidingmenu/tools/listener/a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/listener/a;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/listener/a;->a:Lnet/slidingmenu/tools/listener/a;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/listener/a;->a:Lnet/slidingmenu/tools/listener/a;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(ILnet/slidingmenu/tools/listener/slidingbkxc;)V
a=0;//     .locals 1
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lnet/slidingmenu/tools/listener/slidingbkxc;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lnet/slidingmenu/tools/listener/slidingbkxc;->sliffsd(Landroid/content/Context;)V
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/util/SparseArray;->remove(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized b()Landroid/util/SparseArray;
a=0;//     .locals 1
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/listener/a;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/listener/a;->b:Landroid/util/SparseArray;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/listener/a;->b:Landroid/util/SparseArray;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public d()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/listener/a;->b()Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
