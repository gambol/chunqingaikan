package safiap.framework; class SafFrameworkManager$b { void a() { int a;
a=0;// .class Lsafiap/framework/SafFrameworkManager$b;
a=0;// .super Lsafiap/framework/sdk/a/a;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lsafiap/framework/SafFrameworkManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "b"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lsafiap/framework/a/b;
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;// .field private e:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lsafiap/framework/sdk/ISAFFrameworkCallback;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private synthetic f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iput-object p1, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v2, p3, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p3, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v5, p3, Lsafiap/framework/a/b;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(UninitThis,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     invoke-direct/range {v0 .. v5}, Lsafiap/framework/sdk/a/a;-><init>(Landroid/content/Context;Ljava/lang/String;IZLjava/lang/String;)V
a=0;// 
a=0;//     .line 197
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$b;);p0=(Reference,Lsafiap/framework/SafFrameworkManager$b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 211
a=0;//     iput-object p3, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     .line 212
a=0;//     iput-boolean p4, p0, Lsafiap/framework/SafFrameworkManager$b;->c:Z
a=0;// 
a=0;//     .line 213
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {p1}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->e:Ljava/util/List;
a=0;// 
a=0;//     iput-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->e:Ljava/util/List;
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs a([Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->c:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$a;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Lsafiap/framework/sdk/a/a;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final a()Lsafiap/framework/a/b;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/a/b;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "PluginDownloadTask.onPostExecute():result:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->d:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 237
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Lsafiap/framework/sdk/b/d;->d(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-boolean v1, p0, Lsafiap/framework/SafFrameworkManager$b;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {v0, p1, v1}, Lsafiap/framework/sdk/b/d;->a(Landroid/content/Context;Ljava/lang/String;Z)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 239
a=0;//     invoke-virtual {v0}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/a/b;);
a=0;//     iget-object v1, v1, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     iget v2, v2, Lsafiap/framework/a/b;->d:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, p1, v2}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 241
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1, v2}, Lsafiap/framework/b$a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 242
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->e:Ljava/util/List;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xa
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 251
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 248
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lsafiap/framework/sdk/b/d;->b(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Lsafiap/framework/SafFrameworkManager$b;->c:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-static {v0, v1, v2}, Lsafiap/framework/sdk/b/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->e(Lsafiap/framework/SafFrameworkManager;)Lsafiap/framework/b$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Lsafiap/framework/b$a;->a(Ljava/lang/String;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->e:Ljava/util/List;
a=0;// 
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xb
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs a([Ljava/lang/Integer;)V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 255
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0}, Lsafiap/framework/SafFrameworkManager$b;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 256
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Task "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->b:Lsafiap/framework/a/b;
a=0;// 
a=0;//     iget-object v2, v2, Lsafiap/framework/a/b;->c:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is cancelled."
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 263
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 258
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v4, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->e:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, p1, v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     aget-object v4, p1, v4
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     check-cast p1, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$b;->a([Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     invoke-super {p0}, Lsafiap/framework/sdk/a/a;->onCancelled()V
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager$c;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->d:Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$a;->d:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$a;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     .line 271
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lsafiap/framework/SafFrameworkManager$b;->f:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/SafFrameworkManager$b;->e:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lsafiap/framework/SafFrameworkManager$b;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v0, v1, v2, v3}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;Ljava/util/List;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     check-cast p1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$b;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected synthetic onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 196
a=0;//     check-cast p1, [Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lsafiap/framework/SafFrameworkManager$b;->a([Ljava/lang/Integer;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
