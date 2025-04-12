# product-service/Dockerfile

# Base image
FROM node:18

# Set working directory
WORKDIR /app

# Copy package files and install dependencies
COPY package*.json ./
RUN npm install

# Copy source code
COPY . .

# Expose port
EXPOSE 4001

# Start app
CMD ["npm", "run", "start"]
