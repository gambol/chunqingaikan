package com.weibo.sdk.android.api; class CommentsAPI { void a() { int a;
a=0;// .class public Lcom/weibo/sdk/android/api/CommentsAPI;
a=0;// .super Lcom/weibo/sdk/android/api/WeiboAPI;
a=0;// .source "CommentsAPI.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final SERVER_URL_PRIX:Ljava/lang/String; = "https://api.weibo.com/2/comments"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;//     .locals 0
a=0;//     .param p1, "accessToken"    # Lcom/weibo/sdk/android/Oauth2AccessToken;
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0, p1}, Lcom/weibo/sdk/android/api/WeiboAPI;-><init>(Lcom/weibo/sdk/android/Oauth2AccessToken;)V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/api/CommentsAPI;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public byME(JJIILcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "filter_by_source"    # Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 53
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 54
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 55
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 56
a=0;//     const-string v1, "filter_by_source"
a=0;// 
a=0;//     invoke-virtual {p7}, Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 57
a=0;//     const-string v1, "https://api.weibo.com/2/comments/by_me.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public create(Ljava/lang/String;JZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "comment"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # J
a=0;//     .param p4, "comment_ori"    # Z
a=0;//     .param p5, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 158
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "comment"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 159
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2, p3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 160
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     const-string v1, "comment_ori"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/comments/create.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p5}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// 
a=0;//     .line 163
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "comment_ori"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public destroy(JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "cid"    # J
a=0;//     .param p3, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 175
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 176
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "cid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 177
a=0;//     const-string v1, "https://api.weibo.com/2/comments/destroy.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p3}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public destroyBatch([JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "ids"    # [J
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 189
a=0;//     .local v3, "strb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 193
a=0;//     const-string v4, "ids"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 194
a=0;//     const-string v4, "https://api.weibo.com/2/comments/sdestroy_batch.json"
a=0;// 
a=0;//     const-string v5, "POST"
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v5, p2}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// 
a=0;//     .line 189
a=0;//     :cond_0
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     aget-wide v0, p1, v4
a=0;// 
a=0;//     .line 190
a=0;//     .local v0, "cid":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 189
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public mentions(JJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p8, "filter_by_source"    # Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;
a=0;//     .param p9, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 123
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 124
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 125
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 126
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p7}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 127
a=0;//     const-string v1, "filter_by_source"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 128
a=0;//     const-string v1, "https://api.weibo.com/2/comments/mentions.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p9}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public reply(JJLjava/lang/String;ZZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 4
a=0;//     .param p1, "cid"    # J
a=0;//     .param p3, "id"    # J
a=0;//     .param p5, "comment"    # Ljava/lang/String;
a=0;//     .param p6, "without_mention"    # Z
a=0;//     .param p7, "comment_ori"    # Z
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 209
a=0;//     #v2=(Null);
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 210
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "cid"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 211
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 212
a=0;//     const-string v1, "comment"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 213
a=0;//     if-eqz p6, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     const-string v1, "without_mention"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 218
a=0;//     :goto_0
a=0;//     if-eqz p7, :cond_1
a=0;// 
a=0;//     .line 219
a=0;//     const-string v1, "comment_ori"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 223
a=0;//     :goto_1
a=0;//     const-string v1, "https://api.weibo.com/2/comments/reply.json"
a=0;// 
a=0;//     const-string v2, "POST"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 224
a=0;//     return-void
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     #v2=(Null);
a=0;//     const-string v1, "without_mention"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_1
a=0;//     const-string v1, "comment_ori"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public show(JJJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # J
a=0;//     .param p3, "since_id"    # J
a=0;//     .param p5, "max_id"    # J
a=0;//     .param p7, "count"    # I
a=0;//     .param p8, "page"    # I
a=0;//     .param p9, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p10, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 32
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 33
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 34
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p7}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 35
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p8}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 36
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p9}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 37
a=0;//     const-string v1, "https://api.weibo.com/2/comments/show.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p10}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showBatch([JLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 8
a=0;//     .param p1, "cids"    # [J
a=0;//     .param p2, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     new-instance v2, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v2}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 139
a=0;//     .local v2, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v2=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 140
a=0;//     .local v3, "strb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v5, p1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v4, v5, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 144
a=0;//     const-string v4, "cids"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 145
a=0;//     const-string v4, "https://api.weibo.com/2/comments/show_batch.json"
a=0;// 
a=0;//     const-string v5, "GET"
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v5, p2}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v4=(Integer);v5=(Integer);
a=0;//     aget-wide v0, p1, v4
a=0;// 
a=0;//     .line 141
a=0;//     .local v0, "cid":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 140
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public timeline(JJIIZLcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "trim_user"    # Z
a=0;//     .param p8, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 96
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 97
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 98
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 99
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz p7, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const-string v1, "https://api.weibo.com/2/comments/timeline.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p8}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     const-string v1, "trim_user"
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toME(JJIILcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "since_id"    # J
a=0;//     .param p3, "max_id"    # J
a=0;//     .param p5, "count"    # I
a=0;//     .param p6, "page"    # I
a=0;//     .param p7, "filter_by_author"    # Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;
a=0;//     .param p8, "filter_by_source"    # Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;
a=0;//     .param p9, "listener"    # Lcom/weibo/sdk/android/net/RequestListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/weibo/sdk/android/WeiboParameters;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     invoke-direct {v0}, Lcom/weibo/sdk/android/WeiboParameters;-><init>()V
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "params":Lcom/weibo/sdk/android/WeiboParameters;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/WeiboParameters;);
a=0;//     const-string v1, "since_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 75
a=0;//     const-string v1, "max_id"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3, p4}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 76
a=0;//     const-string v1, "count"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p5}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 77
a=0;//     const-string v1, "page"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p6}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 78
a=0;//     const-string v1, "filter_by_author"
a=0;// 
a=0;//     invoke-virtual {p7}, Lcom/weibo/sdk/android/api/WeiboAPI$AUTHOR_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 79
a=0;//     const-string v1, "filter_by_source"
a=0;// 
a=0;//     invoke-virtual {p8}, Lcom/weibo/sdk/android/api/WeiboAPI$SRC_FILTER;->ordinal()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lcom/weibo/sdk/android/WeiboParameters;->add(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 80
a=0;//     const-string v1, "https://api.weibo.com/2/comments/to_me.json"
a=0;// 
a=0;//     const-string v2, "GET"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v0, v2, p9}, Lcom/weibo/sdk/android/api/CommentsAPI;->request(Ljava/lang/String;Lcom/weibo/sdk/android/WeiboParameters;Ljava/lang/String;Lcom/weibo/sdk/android/net/RequestListener;)V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
}}
